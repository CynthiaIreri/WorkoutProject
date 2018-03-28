package com.hfad.starbuzz;

public class Workout {
    private String name;
    private String description;
    private int imageResourceId;

    //WORKOUTs is an array of Drinks
    public static final Workout[] Abs = {
            new Workout("Abs: Crunch ", "Before anyone’s crowned Cap’n Crunch, remember form is key." +
                                        "Lie on your back with the knees bent and feet flat on the floor." +
                                        "With hands behind the head, place the chin down slightly and peel " +
                                        "the head and shoulders off the mat while engaging the core. " +
                                        "Continue curling up until the upper back is off the mat. " +
                                        "Hold briefly, then lower the torso back toward the mat slowly.",
                    R.drawable.abs1),
            new Workout("Abs: Bicycle", "Lie down with knees bent and hands behind the head. " +
                                        "With the knees in toward the chest, bring the right " +
                                        "elbow towards the left knee as the right leg straightens." +
                                        "Continue alternating sides (like you’re pedaling!). " +
                                        "Just keep the helmet in the closet.",
                    R.drawable.abs2),
            new Workout("Abs: Sprinter Sit-Up", "Want to be a speed demon without getting off the floor? " +
                                                "Lie on your back with the legs straight and arms by your " +
                                                "side—elbows bent at a 90-degree angle. Now sit up, bringing " +
                                                "the left knee toward the right elbow. Lower the body and repeat " +
                                                "on the other side.",
                    R.drawable.abs3)
    };
    public static final Workout[] Shoulders = {
            new Workout("Shoulders: Triceps Dip", "Get seated near a step or bench. " +
                                                    "Sit on the floor with knees slightly bent, " +
                                                    "and grab the edge of the elevated surface and " +
                                                    "straighten the arms. Bend them to a 90-degree angle, " +
                                                    "and straighten again while the heels push towards the floor. " +
                                                    "For some extra fire, reach the right arm out while lifting " +
                                                    "the left leg.\n" +
                    "\n",
                    R.drawable.shoulders1),
            new Workout("Shoulders: Diamond Push-Up", "Jay-Z would approve. " +
                                                        "These push-ups get pimped out with a diamond-shaped " +
                                                        "hand position (situate them so that the thumbs and " +
                                                        "index fingers touch). This hand readjustment will give " +
                                                        "those triceps some extra (burning) love.",
                    R.drawable.shoulders2),
            new Workout("Shoulders: Boxer", "Time to make Muhammad Ali proud. " +
                        "Starting with feet hip-width apart and knees bent, " +
                        "keep the elbows in and extend one arm forward and the " +
                        "other arm back. Hug the arms back in and switch arms—like " +
                        "you’re in the ring!",
                    R.drawable.shoulders3)
    };
    public static final Workout[] Chest = {
            new Workout("Chest: Standard Push-Up", "There’s a reason this one’s a classic. " +
                                                    "With hands shoulder-width apart, keep the feet " +
                                                    "flexed at hip distance, and tighten the core. " +
                                                    "Bend the elbows until the chest reaches the ground, " +
                                                    "and then push back up (make sure to keep the elbows " +
                                                    "tucked close to the body). That’s one!",
                    R.drawable.chest1),
            new Workout("Chest: Dolphin Push-Up", "Start out in dolphin pose (think: down-dog with elbows on the floor). " +
                                                    "Lean forward, lowering the shoulders until the head is over the hands. " +
                                                    "Pull up the arms and return to the starting position. (No ocean necessary.)",
                    R.drawable.chest2),
            new Workout("Chest: Contralateral Limb Raises", "Sounds fancy, huh? Here’s the breakdown: " +
                                                    "Lie on your stomach with the arms outstretched " +
                                                    "and palms facing one another. Slowly lift one arm " +
                                                    "a few inches off the floor, keeping it straight without " +
                                                    "rotating the shoulders and keeping the head and torso still. " +
                                                    "Hold the position, then lower the arm back down, moving to " +
                                                    "the other arm.",
                    R.drawable.chest3)
    };
    public static final Workout[] Legs = {
            new Workout("Legs: Wall Sit ", "Who needs a chair when there’s a wall? Slowly " +
                    "slide your back down a wall until the thighs are parallel to the ground. " +
                    "Make sure the knees are directly above the ankles and keep the back straight. " +
                    "Go for 60 seconds per set (or however long it takes to turn those legs to jelly). " +
                    "Need more fire? Add some bicep curls.",
                    R.drawable.legs1),
            new Workout("Legs: Lunge ", "Stand with the hands on the hips and feet hip-width apart. " +
                    "Step your right leg forward and slowly lower body until left (back) knee is close " +
                    "to or touching the floor and bent at least 90 degrees. Return to the starting position " +
                    "and repeat on the other side. Try stepping back into the lunge for a different variation.",
                    R.drawable.legs2),
            new Workout("Legs: Pistol Squat ", "There may be no gun permit necessary for this one, " +
                    "but it’s still no joke. Stand holding the arms straight out in front of the body, " +
                    "and raise the right leg, flexing the right ankle and pushing the hips back. " +
                    "Then lower the body while keeping the right leg raised. Hold (have fun with that), " +
                    "then return to standing.",
                    R.drawable.legs3)
    };
    public static final Workout[] FullBody = {
            new Workout("Full Body: Inchworm ", "Stand up tall with the legs straight, " +
                    "and do like Lil’ Jon and let those fingertips hit the floor. " +
                    "Keeping the legs straight (but not locked!), slowly lower the " +
                    "torso toward the floor, and then walk the hands forward. Once in a push-up position," +
                    " start taking tiny steps so the feet meet the hands. Continue bugging out for 4-6 reps.",
                    R.drawable.full1),
            new Workout("Full Body: Tuck Jump ", "Standing with the knees slightly bent, " +
                    "jump up as high as possible (pretend Jeremy Lin is watching!) " +
                    "and bring the knees in toward the chest while extending the arms" +
                    "straight out. Land with the knees slightly bent and quickly jump " +
                    "(on it) again!",
                    R.drawable.full2),
            new Workout("Full Body: Mountain Climber", "Starting on your hands and knees, " +
                    "bring the left foot forward directly under the chest while straightening " +
                    "the right leg. Keeping the hands on the ground and core tight, jump and " +
                    "switch legs. The left leg should now be extended behind the body with the " +
                    "right knee forward. Next up? Everest.",
                    R.drawable.full3)
    };

    //Each Workout has a name, description, and an image resource
    private Workout(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
