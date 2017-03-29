package com.paxtorval.speechlet;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.paxtorval.handler.IntentSelector;

/**
 * Created by Carlos Pastor on 28/03/2017.
 */
public class MealPlannerSpeechlet implements Speechlet {

    private IntentSelector intentSelector;

    public MealPlannerSpeechlet(IntentSelector intentSelector){
        this.intentSelector = intentSelector;
    }

    public void onSessionStarted(SessionStartedRequest sessionStartedRequest, Session session) throws SpeechletException {
        //initialization logic goes here
    }

    public SpeechletResponse onLaunch(LaunchRequest launchRequest, Session session) throws SpeechletException {
        //on launch logic goes here
        return intentSelector.welcomeHandler.getIntentResponse();
    }

    public SpeechletResponse onIntent(IntentRequest intentRequest, Session session) throws SpeechletException {
        Intent intent = intentRequest.getIntent();

        String intentName = (intent != null) ? intent.getName() : null;

        if ("AMAZON.HelpIntent".equals(intentName)){
            return intentSelector.helpHandler.getIntentResponse();
        }
        else {
            throw new SpeechletException("Invalid Intent");
        }
    }

    public void onSessionEnded(SessionEndedRequest sessionEndedRequest, Session session) throws SpeechletException {

    }
}
