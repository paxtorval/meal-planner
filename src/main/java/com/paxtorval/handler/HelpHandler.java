package com.paxtorval.handler;

import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;

/**
 * Created by Carlos Pastor on 28/03/2017.
 */
public class HelpHandler implements IntentHandler {

    public SpeechletResponse getIntentResponse() {
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("This is the help");

        return SpeechletResponse.newTellResponse(outputSpeech);
    }
}
