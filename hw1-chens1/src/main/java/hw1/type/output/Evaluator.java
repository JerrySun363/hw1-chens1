

/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
package hw1.type.output;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import hw1.type.input.Question;
import org.apache.uima.jcas.tcas.Annotation;


/** This type is used for final formatted output for this an evaluation processs.</br>
The Question, AnswerScore are needed.</br>
Meanwhile the totalNumberOfAnswer (the N), pickedRightAnswer, and precision are also included so that we can evaluate the effectiveness of the Analyzer.
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * XML source: /home/jerry/git/hw1-chens1/hw1-chens1/src/main/resources/TypeSystem.xml
 * @generated */
public class Evaluator extends Annotation {
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

  /** getter for question - gets Initial question is input here for information.
   * @generated */
  public Question getQuestion() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets Initial question is input here for information. 
   * @generated */
  public void setQuestion(Question v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets All the input answers are output and sorted according to their score in the evaluation process. Also, isCorrect is used to indicate whether the answer is right.
   * @generated */
  public FSArray getAnswers() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets All the input answers are output and sorted according to their score in the evaluation process. Also, isCorrect is used to indicate whether the answer is right. 
   * @generated */
  public void setAnswers(FSArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - All the input answers are output and sorted according to their score in the evaluation process. Also, isCorrect is used to indicate whether the answer is right.
   * @generated */
  public AnswerScore getAnswers(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - All the input answers are output and sorted according to their score in the evaluation process. Also, isCorrect is used to indicate whether the answer is right.
   * @generated */
  public void setAnswers(int i, AnswerScore v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: totalRightAnswers

  /** getter for totalRightAnswers - gets The total number of Right Answers the input has.
   * @generated */
  public int getTotalRightAnswers() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_totalRightAnswers == null)
      jcasType.jcas.throwFeatMissing("totalRightAnswers", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_totalRightAnswers);}
    
  /** setter for totalRightAnswers - sets The total number of Right Answers the input has. 
   * @generated */
  public void setTotalRightAnswers(int v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_totalRightAnswers == null)
      jcasType.jcas.throwFeatMissing("totalRightAnswers", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_totalRightAnswers, v);}    
   
    
  //*--------------*
  //* Feature: pickedRightAnswers

  /** getter for pickedRightAnswers - gets Right answers that are picked by the evluation processors according to their score in the first N answers.
   * @generated */
  public int getPickedRightAnswers() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_pickedRightAnswers == null)
      jcasType.jcas.throwFeatMissing("pickedRightAnswers", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_pickedRightAnswers);}
    
  /** setter for pickedRightAnswers - sets Right answers that are picked by the evluation processors according to their score in the first N answers. 
   * @generated */
  public void setPickedRightAnswers(int v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_pickedRightAnswers == null)
      jcasType.jcas.throwFeatMissing("pickedRightAnswers", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_pickedRightAnswers, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets precision = pickedRightAnswers/ totalRightAnswers </br>
precision has a values between [0, 1].
   * @generated */
  public double getPrecision() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets precision = pickedRightAnswers/ totalRightAnswers </br>
precision has a values between [0, 1]. 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision, v);}    
  }

    