
/**
 * Write a description of class DNAtoRNATranscribor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DNAtoRNATranscribor implements Runnable
{
    private String DNASequence = " ";
    private String RNASequence = " ";
    public DNAtoRNATranscribor(String DNAin){
        DNASequence = DNAin;
    }

    public void transcribe(){
        for(int i = 0; i < DNASequence.length(); i++){
            char nucleotide = DNASequence.charAt(i);
            if(nucleotide == 'T'){
                RNASequence += 'U';
            }
            else{
                RNASequence += nucleotide;
            }
        }

    }
   public void run(){
       this.transcribe();
       System.out.println("Replaced all T with U in sequence. Result: " + RNASequence);
    }
}