/**
 * This class allows you to count the nucleotides of a DNA sequence and store the results.
 *
 * @author Tori Walen
 * @version CSSKL 143 Lab9
 */
public class NucleotideCounter implements Runnable
{
    private String DNASequence; //
    
    private int aCount;
    private int cCount;
    private int gCount;
    private int tCount;
 
    public NucleotideCounter(String in){
        DNASequence = in;
    }
    public void run(){
        
        countNucleotides();
        System.out.println("Count of A: "+ aCount + ", C: " + cCount + ", G: " +gCount+ " , T: " + tCount);
    }
        /**
         * Method countNucleotides
         * 
         * This method counts the different nucleotides in a string of DNA.
         * It counts A,C,G, and T in the sequence and sets the instance variables
         * of each count.
         */
    public void countNucleotides(){
        for(int i = 0; i < DNASequence.length(); i++){
           char nucleotide = DNASequence.charAt(i);
           if(nucleotide == 'A'){
        aCount += 1;
    }
    else if(nucleotide == 'C'){
        cCount += 1;
    }
    else if(nucleotide == 'G'){
        gCount += 1;
    }
     else if(nucleotide == 'T'){
        tCount += 1;
    }
    
    }
}
}
