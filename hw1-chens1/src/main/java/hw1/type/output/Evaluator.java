

/* First created by JCasGen Tue Sep 10 00:55:27 EDT 2013 */
package hw1.type.output;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.type.General;
import org.apache.uima.jcas.cas.FSList;
import hw1.type.input.Question;


/** This is the format output for all three scoring methods.</br> 
 * Annotators may use this type to give a full output in a unified format way and contain enough information.
 * 
 * @generated */
public class Evaluator extends General {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
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
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluator(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets It should output the question of the original problem.
   * @generated */
  public Question getQuestion() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets It should output the question of the original problem. 
   * @generated */
  public void setQuestion(Question v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets A list of answers and its corresponding score
   * @generated */
  public FSList getAnswers() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets A list of answers and its corresponding score 
   * @generated */
  public void setAnswers(FSList v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: totalRightAnswer

  /** getter for totalRightAnswer - gets namely the N of the file input
   * @generated */
  public int getTotalRightAnswer() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_totalRightAnswer == null)
      jcasType.jcas.throwFeatMissing("totalRightAnswer", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_totalRightAnswer);}
    
  /** setter for totalRightAnswer - sets namely the N of the file input 
   * @generated */
  public void setTotalRightAnswer(int v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_totalRightAnswer == null)
      jcasType.jcas.throwFeatMissing("totalRightAnswer", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_totalRightAnswer, v);}    
   
    
  //*--------------*
  //* Feature: pickedRightAnswer

  /** getter for pickedRightAnswer - gets the number of Right answer according to the scores by the scoring methods
   * @generated */
  public int getPickedRightAnswer() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_pickedRightAnswer == null)
      jcasType.jcas.throwFeatMissing("pickedRightAnswer", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_pickedRightAnswer);}
    
  /** setter for pickedRightAnswer - sets the number of Right answer according to the scores by the scoring methods 
   * @generated */
  public void setPickedRightAnswer(int v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_pickedRightAnswer == null)
      jcasType.jcas.throwFeatMissing("pickedRightAnswer", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_pickedRightAnswer, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets rightAnswer(s)/totalAnswer
   * @generated */
  public double getPrecision() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets rightAnswer(s)/totalAnswer 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision, v);}    
  }

    