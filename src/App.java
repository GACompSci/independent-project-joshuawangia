import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    private Guess guess = new Guess();
    private QNA qna = new QNA();
    private int nextQuestion = guess.getNextQuestion();

    private Label questionLabel = new Label();
    private TextField inputField = new TextField();
    private Button submitButton = new Button("Submit");
    private Button yesButton = new Button("Yes");
    private Button noButton = new Button("No");
    private Label resultLabel = new Label();

    private VBox root = new VBox(15);

    @Override
    public void start(Stage primaryStage) {
        // Styling the root layout
        root.setStyle("-fx-padding: 20; -fx-background-color: #f0f8ff; -fx-alignment: center;");
        root.setAlignment(Pos.CENTER);

        // Styling the question label
        questionLabel.setFont(new Font("Arial", 18));
        questionLabel.setTextFill(Color.DARKBLUE);

        // Styling the result label
        resultLabel.setFont(new Font("Arial", 16));
        resultLabel.setTextFill(Color.GREEN);

        // Styling buttons
        submitButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        yesButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        noButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white;");

        // Layout for boolean buttons
        HBox booleanButtons = new HBox(10, yesButton, noButton);
        booleanButtons.setAlignment(Pos.CENTER);

        // Button actions
        submitButton.setOnAction(e -> handleTextAnswer());
        yesButton.setOnAction(e -> handleBooleanAnswer(true));
        noButton.setOnAction(e -> handleBooleanAnswer(false));

        // Adding components to the root layout
        root.getChildren().addAll(questionLabel, inputField, submitButton, booleanButtons, resultLabel);

        updateQuestion();

        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("GAkinator - Teacher Guesser");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateQuestion() {
        if (guess.getLength() > 1) {
            questionLabel.setText(qna.askQuestion(nextQuestion));

            boolean isBooleanQuestion = !(nextQuestion < 5 && nextQuestion % 3 != 0);

            inputField.setVisible(!isBooleanQuestion);
            submitButton.setVisible(!isBooleanQuestion);
            yesButton.setVisible(isBooleanQuestion);
            noButton.setVisible(isBooleanQuestion);

        } else { 
            questionLabel.setText("Your teacher is:");
            inputField.setVisible(false);
            submitButton.setVisible(false);
            yesButton.setVisible(false);
            noButton.setVisible(false);
            resultLabel.setText(guess.guessTeacher() + "!");
        }
    }

    private void handleTextAnswer() {
        String input = inputField.getText().trim();
        if (input.isEmpty()) return;

        guess.removeTeachers(qna.Sanswer(nextQuestion, input));
        inputField.clear();
        nextQuestion++;
        updateQuestion();
    }

    private void handleBooleanAnswer(boolean answer) {
        guess.removeTeachers(qna.Banswer(nextQuestion, answer));
        nextQuestion++;
        updateQuestion();
    }

    public static void main(String[] args) {
        launch(args);
    }
}