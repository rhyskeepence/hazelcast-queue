package rhyskeepence.hazelcast.common;

import java.io.Serializable;

public class Event implements Serializable {

    final String storyOne = "Researchers at San Diego Zoo have been studying what has been described as the " +
            "\"secret language\" of elephants.\n They have been monitoring communications between animals that " +
            "cannot be heard by human ears.\nThe elephant's trumpeting call will be familiar to most people, " +
            "but the animals also emit growls.\nTheir growls, however, are only partly audible; two-thirds of " +
            "the call is at frequencies that are too low to be picked up by our hearing.\nTo learn more about " +
            "the inaudible part of the growl, the team attached a microphone sensitive to these low frequencies " +
            "and a GPS tracking system to eight of the zoo's female elephants.\nThe researchers could then " +
            "correlate the noises the animals were making with what they were doing.\nMatt Anderson, who led " +
            "the project, told BBC News: \"We're excited to learn of the hierarchy within the female herd and " +
            "how they interact and intercede with one another.\"\nPredator warning?\nThe team has already " +
            "learned that pregnant females use this low frequency communication to announce to the rest of " +
            "their herd that they are about to give birth.\n\nOnly a third of an elephant's growl is audible " +
            "to humans\n\"We've seen that after their long gestation of over two years, in the last 12 days " +
            "we see a manipulation of the low part of the growl, the low part that we can't hear.\n\"This we " +
            "believe is to announce to the rest of the herd that the baby is imminent,\" said Dr Anderson.\n" +
            "The researchers believe that this also warns the elephants to look out for predators.\n\"You may " +
            "think that a baby calf of about 300 pounds would not be as open to predation as other species,\" " +
            "he says. \"But packs of hyenas are a big threat in the wild.\"\nDr Anderson and his team are " +
            "continuing to analyse data in order to learn more about this secret elephant language.";

    final String storyTwo = "An alleged hacker has been hailed as a latter-day Robin Hood for leaking data about " +
            "the finances of banks and state-owned firms to Latvian TV.\nUsing the alias \"Neo\" - a reference" +
            " to The Matrix films - the hacker claims he wants to expose those cashing in on the recession in " +
            "Latvia.\nHe is slowly passing details of leading Latvian firms via Twitter to the TV station and " +
            "has its audiences hooked.\nThe Latvian government and police are investigating the security " +
            "breach.\nData leaked so far includes pay details of managers from a Latvian bank that received " +
            "a bail-out.\nIt reveals that many did not take the salary cuts they promised.\nOther data shows " +
            "that state-owned companies secretly awarded bonuses while publicly asking the government for help.\n" +
            "'Cult status'\nThe anonymous hacker claims to be part of a group - called the Fourth Awakening " +
            "People's Army - that downloaded more than seven million confidential tax documents from the State " +
            "Revenue Service. He is thought to be based in Britain.\nOver a three month period they downloaded " +
            "the private data of up to 1,000 companies.\nIlze Nagla, a TV presenter on the state-owned Latvian" +
            " TV, told the BBC the hacker has attained cult status for some.\n\"A lot of people perceive him " +
            "as a modern, virtual Robin Hood,\" she told the BBC.\n\"On the one hand of course he has stolen " +
            "confidential data... and he actually has committed a crime. But at the same time there is value " +
            "for the public in the sense that now a lot of information gets disclosed and the whole system " +
            "maybe becomes a little more transparent,\" she said.\nLatvia is currently in the middle of its " +
            "worst economic crisis since it broke free from the Soviet Union in 1991.\nUnemployment, at 23%, " +
            "is the highest in the European Union and over the last two years economic output has dropped by " +
            "almost a quarter.";

    final String uuid;

    public Event(String uuid) {
        this.uuid = uuid;
    }

    public String getStoryOne() {
        return storyOne;
    }

    public String getStoryTwo() {
        return storyTwo;
    }
}
