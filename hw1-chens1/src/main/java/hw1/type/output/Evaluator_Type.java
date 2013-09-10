
/* First created by JCasGen Tue Sep 10 00:55:27 EDT 2013 */
package hw1.type.output;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import hw1.type.General_Type;

/** This is the format output for all three 
 * Updated by JCasGen Tue Sep 10 00:56:01 EDT 2013
 * @generated */
public class Evaluator_Type extends General_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.type.output.Evaluator");
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "hw1.type.output.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answers;
  /** @generated */
  final int     casFeatCode_answers;
  /** @generated */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answers);
  }
  /** @generated */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_answers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_totalRightAnswer;
  /** @generated */
  final int     casFeatCode_totalRightAnswer;
  /** @generated */ 
  public int getTotalRightAnswer(int addr) {
        if (featOkTst && casFeat_totalRightAnswer == null)
      jcas.throwFeatMissing("totalRightAnswer", "hw1.type.output.Evaluator");
    return ll_cas.ll_getIntValue(addr, casFeatCode_totalRightAnswer);
  }
  /** @generated */    
  public void setTotalRightAnswer(int addr, int v) {
        if (featOkTst && casFeat_totalRightAnswer == null)
      jcas.throwFeatMissing("totalRightAnswer", "hw1.type.output.Evaluator");
    ll_cas.ll_setIntValue(addr, casFeatCode_totalRightAnswer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pickedRightAnswer;
  /** @generated */
  final int     casFeatCode_pickedRightAnswer;
  /** @generated */ 
  public int getPickedRightAnswer(int addr) {
        if (featOkTst && casFeat_pickedRightAnswer == null)
      jcas.throwFeatMissing("pickedRightAnswer", "hw1.type.output.Evaluator");
    return ll_cas.ll_getIntValue(addr, casFeatCode_pickedRightAnswer);
  }
  /** @generated */    
  public void setPickedRightAnswer(int addr, int v) {
        if (featOkTst && casFeat_pickedRightAnswer == null)
      jcas.throwFeatMissing("pickedRightAnswer", "hw1.type.output.Evaluator");
    ll_cas.ll_setIntValue(addr, casFeatCode_pickedRightAnswer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "hw1.type.output.Evaluator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "hw1.type.input.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_answers = jcas.getRequiredFeatureDE(casType, "answers", "uima.cas.FSList", featOkTst);
    casFeatCode_answers  = (null == casFeat_answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answers).getCode();

 
    casFeat_totalRightAnswer = jcas.getRequiredFeatureDE(casType, "totalRightAnswer", "uima.cas.Integer", featOkTst);
    casFeatCode_totalRightAnswer  = (null == casFeat_totalRightAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_totalRightAnswer).getCode();

 
    casFeat_pickedRightAnswer = jcas.getRequiredFeatureDE(casType, "pickedRightAnswer", "uima.cas.Integer", featOkTst);
    casFeatCode_pickedRightAnswer  = (null == casFeat_pickedRightAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pickedRightAnswer).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    