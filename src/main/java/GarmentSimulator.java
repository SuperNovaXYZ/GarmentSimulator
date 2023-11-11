public class GarmentSimulator {

    // Abstract product classes
    interface Top {
        String display();
    }

    interface Pants {
        String display();
    }

    interface Shoes {
        String display();
    }

    // Concrete product classes
    static class ProfessionalTop implements Top {
        public String display() {
            return "Professional Top";
        }
    }

    static class CasualTop implements Top {
        public String display() {
            return "Casual Top";
        }
    }

    static class PartyTop implements Top {
        public String display() {
            return "Party Top";
        }
    }

    static class ProfessionalPants implements Pants {
        public String display() {
            return "Professional Pants";
        }
    }

    static class CasualPants implements Pants {
        public String display() {
            return "Casual Pants";
        }
    }

    static class PartyPants implements Pants {
        public String display() {
            return "Party Pants";
        }
    }

    static class ProfessionalShoes implements Shoes {
        public String display() {
            return "Professional Shoes";
        }
    }

    static class CasualShoes implements Shoes {
        public String display() {
            return "Casual Shoes";
        }
    }

    static class PartyShoes implements Shoes {
        public String display() {
            return "Party Shoes";
        }
    }

    // Abstract factory interface
    interface GarmentFactory {
        Top createTop();
        Pants createPants();
        Shoes createShoes();
    }

    // Concrete factory classes
    static class ProfessionalGarmentFactory implements GarmentFactory {
        public Top createTop() {
            return new ProfessionalTop();
        }

        public Pants createPants() {
            return new ProfessionalPants();
        }

        public Shoes createShoes() {
            return new ProfessionalShoes();
        }
    }

    static class CasualGarmentFactory implements GarmentFactory {
        public Top createTop() {
            return new CasualTop();
        }

        public Pants createPants() {
            return new CasualPants();
        }

        public Shoes createShoes() {
            return new CasualShoes();
        }
    }

    static class PartyGarmentFactory implements GarmentFactory {
        public Top createTop() {
            return new PartyTop();
        }

        public Pants createPants() {
            return new PartyPants();
        }

        public Shoes createShoes() {
            return new PartyShoes();
        }
    }

    // Client code
    void createGarment(GarmentFactory factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        System.out.println("Created outfit: " + top.display() + ", " + pants.display() + ", " + shoes.display());
    }

    public static void main(String[] args) {
        // Create a simulator
        GarmentSimulator simulator = new GarmentSimulator();

        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        GarmentFactory casualFactory = new CasualGarmentFactory();
        GarmentFactory partyFactory = new PartyGarmentFactory();

        // Create and display garments
        simulator.createGarment(professionalFactory);
        simulator.createGarment(casualFactory);
        simulator.createGarment(partyFactory);
    }
}
