package com.paxtorval;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import com.paxtorval.handler.IntentSelector;
import com.paxtorval.speechlet.MealPlannerSpeechlet;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO change this to something appropriate
 * Hello world!
 *
 */
public class MealPlannerSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler
{
    private static final Set<String> supportedApplicationIds = new HashSet<String>();

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        //TODO put the proper value down here
        supportedApplicationIds.add("amzn1.echo-sdk-ams.app.[unique-value-here]");
    }

    public MealPlannerSpeechletRequestStreamHandler() {
        super(new MealPlannerSpeechlet(new IntentSelector()), supportedApplicationIds);
    }
}
