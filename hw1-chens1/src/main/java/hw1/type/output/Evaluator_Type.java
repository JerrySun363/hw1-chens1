
/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This type is used for final formatted output for this an evaluation processs.</br>
The Question, AnswerScore are needed.</br>
Meanwhile the totalNumberOfAnswer (the N), pickedRightAnswer, and precision are also included so that we can evaluate the effectiveness of the Analyzer.
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * @generated */
public class Evaluator_Type extends Annotation_Type {
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
  public int getAnswers(int addr, int i) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
  }
   
  /** @generated */ 
  public void setAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "hw1.type.output.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_totalRightAnswers;
  /** @generated */
  final int     casFeatCode_totalRightAnswers;
  /** @generated */ 
  public int getTotalRightAnswers(int addr) {
        if (featOkTst && casFeat_totalRightAnswers == null)
      jcas.throwFeatMissing("totalRightAnswers", "hw1.type.output.Evaluator");
    return ll_cas.ll_getIntValue(addr, casFeatCode_totalRightAnswers);
  }
  /** @generated */    
  public void setTotalRightAnswers(int addr, int v) {
        if (featOkTst && casFeat_totalRightAnswers == null)
      jcas.throwFeatMissing("totalRightAnswers", "hw1.type.output.Evaluator");
    ll_cas.ll_setIntValue(addr, casFeatCode_totalRightAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pickedRightAnswers;
  /** @generated */
  final int     casFeatCode_pickedRightAnswers;
  /** @generated */ 
  public int getPickedRightAnswers(int addr) {
        if (featOkTst && casFeat_pickedRightAnswers == null)
      jcas.throwFeatMissing("pickedRightAnswers", "hw1.type.output.Evaluator");
    return ll_cas.ll_getIntValue(addr, casFeatCode_pickedRightAnswers);
  }
  /** @generated */    
  public void setPickedRightAnswers(int addr, int v) {
        if (featOkTst && casFeat_pickedRightAnswers == null)
      jcas.throwFeatMissing("pickedRightAnswers", "hw1.type.output.Evaluator");
    ll_cas.ll_setIntValue(addr, casFeatCode_pickedRightAnswers, v);}
    
  
 
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

 
    casFeat_answers = jcas.getRequiredFeatureDE(casType, "answers", "uima.cas.FSArray", featOkTst);
    casFeatCode_answers  = (null == casFeat_answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answers).getCode();

 
    casFeat_totalRightAnswers = jcas.getRequiredFeatureDE(casType, "totalRightAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_totalRightAnswers  = (null == casFeat_totalRightAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_totalRightAnswers).getCode();

 
    casFeat_pickedRightAnswers = jcas.getRequiredFeatureDE(casType, "pickedRightAnswers", "uima.cas.Integer", featOkTst);
    casFeatCode_pickedRightAnswers  = (null == casFeat_pickedRightAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pickedRightAnswers).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    