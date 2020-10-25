package seedu.address.ui;

import static java.util.Objects.requireNonNull;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;

import java.util.List;

/**
 * A ui for the column that displays the results of the method.
 */
public class ResultPanel extends UiPart<Region> {

    private static final String FXML = "ResultPanel.fxml";

    @FXML
    private TextArea resultDisplay;

    @FXML
    private TextArea inputFormat;

    @FXML
    private TextArea inputExample;

    public ResultPanel() {
        super(FXML);
    }

    /**
     * This method is invoked when the command is executed successfully.
      * @param feedbackToUser the feedback to display to the user.
     */
    public void setFeedbackToUser(String feedbackToUser) {
        requireNonNull(feedbackToUser);
        resultDisplay.setText(feedbackToUser);
        inputFormat.setText("");
        inputExample.setText("");
    }

    /**
     * This method is invoked when the command is executed unsuccessfully.
     * @param feedbackToUser the feedback to display to the user.
     */
    public void setFeedbackToUser(List<String> feedbackToUser) {
        requireNonNull(feedbackToUser);
        resultDisplay.setText("");
        inputFormat.setText("");
        inputExample.setText("");
    }

}
