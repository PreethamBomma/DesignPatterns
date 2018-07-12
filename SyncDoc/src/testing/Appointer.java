package testing;

public class Appointer {
    private Doctor allergy;
    private Doctor anesthesiologist;
    private Doctor cardio;
    private Doctor derma;
    private Doctor endocrin;
    private Doctor gastro;
    private Doctor ortho;
    private Doctor physician;
    private Doctor physiologist;
    private Doctor psychiatrist;

    public Appointer() {
        allergy = new Allergy();
        anesthesiologist = new Anesthesiologist();
        cardio = new Cardio();
        derma = new Derma();
        endocrin = new Endocrin();
        gastro = new Gastro();
        ortho = new Ortho();
        physician = new Physician();
        physiologist = new Physiologist();
        psychiatrist = new Psychiatrist();
        }

    public void bookAllergist(){
        allergy.book();
    }

    public void bookAnesthesiologist(){
        anesthesiologist.book();
    }

    public void bookCardio(){
        cardio.book();
    }

    public void bookDermatologist(){
        derma.book();
    }

    public void bookEndocronlogist(){
        endocrin.book();
    }
    public void bookGastroenterologist(){
        gastro.book();
    }
    public void bookOrtho(){
        ortho.book();
    }
    public void bookPhysician(){
        physician.book();
    }
    public void bookPhysiologist(){
        physiologist.book();
    }
    public void bookPsychiatrist(){
        psychiatrist.book();
    }

}
