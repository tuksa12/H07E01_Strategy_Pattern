package de.tum.in.ase.eist;

public class Policy {
    private Context context;

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {
        if (context.isPhoneBookSorted()) {
            if (context.isPhoneBookSorted()) {
                context.setSearchAlgorithm(new BinarySearch());
            } else {
                context.setSearchAlgorithm(new LinearSearch());
            }
        }
    }
}
