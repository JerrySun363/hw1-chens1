package hw1.annotators;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.*;

import hw1.type.input.Answer;
import hw1.type.input.Question;

public class TextAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException {
    
    int globalIndex = 0;
    String text = jcas.getDocumentText();
    String[] lines = text.split("\n");
    for (int i = 0; i < lines.length; i++) {
      if (lines[i].startsWith("Q")) {
        addQuestion(lines[i],globalIndex,jcas);   
      } else {
        addAnswer(lines[i],globalIndex,jcas);
      }
        globalIndex += (lines[i].length()+1);  
    }
  }

  private void addQuestion(String line, int globalIndex, JCas jcas) {
    int offset = line.indexOf(" ");
    Question q = new Question(jcas);
    q.setBegin(offset + globalIndex+1);
    q.setEnd(globalIndex + line.length());
    q.setConfidence(1.0);
    q.addToIndexes();
    System.out.println("This is a question, begin at "+q.getBegin()+" ends at "+q.getEnd());
  }

  private void addAnswer(String line, int globalIndex, JCas jcas) {
    int offset1 = line.indexOf(" ");
    int offset2 = line.indexOf(" ", offset1+1);
    int correctness = Integer.parseInt(line.substring(offset1+1, offset2));
    boolean isCorrect = (correctness==1);
    Answer a =new Answer(jcas);
    a.setBegin(offset2+globalIndex+1);
    a.setEnd(line.length()+globalIndex);
    a.setConfidence(1.0);
    a.setIsCorrect(isCorrect);
    a.addToIndexes();
    System.out.println("This is an answer, begin at "+a.getBegin()+" ends at "+a.getEnd()+"and it is "+a.getIsCorrect());
    
  }
}
