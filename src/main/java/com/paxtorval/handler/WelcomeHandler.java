package com.paxtorval.handler;

import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;

/**
 * Created by Carlos Pastor on 28/03/2017.
 */
public class WelcomeHandler implements IntentHandler {

    public SpeechletResponse getIntentResponse() {
        String speechText = "Welcome to the Meal Planner, would you like to check your planned meals for the week?";

        SimpleCard card = new SimpleCard();
        card.setTitle("WelcomeResponse");
        card.setContent(speechText);

        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(speech);

        return SpeechletResponse.newAskResponse(speech, reprompt, card);
    }
}
