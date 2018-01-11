
/**
 * Write a description of class ReverseComplement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseComplement implements Runnable
{
    private String DNASequence = " ";
    private String reverseComplementSequence = " ";
    public ReverseComplement(String DNAin){
        DNASequence = DNAin;
    }

    public String reverse(String sequenceIn){
        String reverse = "";
        for(int i = sequenceIn.length()-1; i >= 0; i--){

            reverse += sequenceIn.charAt(i);
        }
        return reverse;
    }


    public String complement(String sequenceIn){
        String complement = "";
        char nucleotideComplement = 'X';
        for(int i = 0; i < sequenceIn.length(); i++){
            char nucleotide = sequenceIn.charAt(i);
            if(nucleotide == 'A'){
                nucleotideComplement = 'T';
            }
            else if(nucleotide == 'C'){
                nucleotideComplement = 'G';
            }
            else if(nucleotide == 'G'){
                nucleotideComplement = 'C';
            }
            else if(nucleotide == 'T'){
                nucleotideComplement = 'A';
            }
                complement += nucleotideComplement;
            }
        
        return complement;
    }

    public void run(){
        reverseComplementSequence = reverse(complement(DNASequence));
        System.out.println(reverseComplementSequence);
    }
}