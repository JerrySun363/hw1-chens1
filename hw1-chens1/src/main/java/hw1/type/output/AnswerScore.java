

/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
package hw1.type.output;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.type.General;
import hw1.type.input.Answer;


/** This answer score type serves as a middle type where it combines an answer with an score.</br> See the documentation for why not inherting them directly.</br>This type simplies puts the two together aand for sorting and final output.
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * XML source: /home/jerry/git/hw1-chens1/hw1-chens1/src/main/resources/TypeSystem.xml
 * @generated */
public class AnswerScore extends General {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets The score is used to describe the score of an answer with varioud answer scoring methods.
   * @generated */
  public double getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.type.output.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score is used to describe the score of an answer with varioud answer scoring methods. 
   * @generated */
  public void setScore(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "hw1.type.output.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets The answer of the Answerscore type. An embed instance rather than a extend class. This is useful when you try to modify Answer type. Little or no modification is needed for AnswerScore type.
   * @generated */
  public Answer getAnswer() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "hw1.type.output.AnswerScore");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets The answer of the Answerscore type. An embed instance rather than a extend class. This is useful when you try to modify Answer type. Little or no modification is needed for AnswerScore type. 
   * @generated */
  public void setAnswer(Answer v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "hw1.type.output.AnswerScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    