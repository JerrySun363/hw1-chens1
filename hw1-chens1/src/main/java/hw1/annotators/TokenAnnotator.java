/**
 * 
 */
package hw1.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.internal.util.TextTokenizer;
import org.apache.uima.jcas.JCas;

import hw1.type.input.Token;

/**
 * @author Jerry Sun
 * 
 */
public class TokenAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    String text = aJCas.getDocumentText();
    String sentences[] = text.split("\n");
    int globalIndex = 0;
    for (int i = 0; i < sentences.length; i++) {
      int offset = 0;
      TextTokenizer t = new TextTokenizer(sentences[i]);
      t.addSeparators(".,?");
      // t.setShowSeparators(false);
      // t.setShowWhitespace(false);
      t.nextToken();// ignore the first Q or A as token.
      t.nextToken();// ignore the whitespace
      offset += 2;
      if (sentences[i].startsWith("A")) {
        t.nextToken();
        t.nextToken();// ignore the 1 or 0 and the whitespace after it.
        offset += 2;
      }
      while (t.hasNext()) {
        String tokenString = t.nextToken();
        if (tokenString.equals(",") || tokenString.equals(".") || tokenString.equals("?")
                || tokenString.equals(" ")) {
          offset += 1;
          continue;
        }

        Token token = new Token(aJCas);
        token.setBegin(offset + globalIndex);
        offset += tokenString.length();
        token.setEnd(offset + globalIndex);
        token.setConfidence(1.0);
        //offset += 1;
        token.addToIndexes();
        System.out.println("Token string is "+tokenString+" Token begins at "+token.getBegin()+" tokens ends at "+ token.getEnd());
      }
      globalIndex += (sentences[i].length()+1);

    }

  }

}
