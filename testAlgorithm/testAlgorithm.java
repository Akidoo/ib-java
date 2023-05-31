public class testAlgorithm {

    static char[] punctuation = { ',', '.', '\"', '\'', ':', ';', '(', ')', '?', '!' };
    public static int nLetters(String words) {
		boolean isLetter = false;
        int count = 0;
        char[] wordc = words.toCharArray();
        while (wordc[count] != ' ')
        {
            count = count + 1;
             isLetter = true;
        }
        for(int i = 0; i<wordc.length; i++){
			for(int j = 0; j<punctuation.length; j++){
				if(wordc[i] == punctuation[j]){
					count = count-1;
					isLetter = false;
					}
				}
			}
        return count;
    }
    public static int nWords(String sentence) {
		int count = 0;
		char[] sentencec = sentence.toCharArray();
		for(int i = 0; i<sentencec.length; i++){
			if(sentencec[i] == ' '){
				count = count + 1;
				}
				else if(sentencec[i] == '.'){
					count = count +1;
					break;
					}
			}
			return count;
		}
		
		
	public static double avWords(String sentence) {
		double sentencec = nWords(sentence);
		double wordc = nLetters(sentence);
		double average = wordc/sentencec;
		
		return average;
		
		}	
	

    public static void main(String[] args)
    {
        System.out.println("nLetters(\"green, \") = " + nLetters("green, "));
        System.out.println("nLetters(\"green \") = " + nLetters("green "));
        System.out.println("According to all known laws of aviation, there is no way a bee should be able to fly.");
        System.out.println(avWords("According to all known laws of aviation, there is no way a bee should be able to fly."));
    }
}
