
/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
package hw1.type;

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

/** This is a base type inherited by all the types.</br>
It should include all the shared features the types in the system has.</br>
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * @generated */
public class General_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (General_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = General_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new General(addr, General_Type.this);
  			   General_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new General(addr, General_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = General.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.type.General");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1.type.General");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "hw1.type.General");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_processorID;
  /** @generated */
  final int     casFeatCode_processorID;
  /** @generated */ 
  public String getProcessorID(int addr) {
        if (featOkTst && casFeat_processorID == null)
      jcas.throwFeatMissing("processorID", "hw1.type.General");
    return ll_cas.ll_getStringValue(addr, casFeatCode_processorID);
  }
  /** @generated */    
  public void setProcessorID(int addr, String v) {
        if (featOkTst && casFeat_processorID == null)
      jcas.throwFeatMissing("processorID", "hw1.type.General");
    ll_cas.ll_setStringValue(addr, casFeatCode_processorID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public General_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_processorID = jcas.getRequiredFeatureDE(casType, "processorID", "uima.cas.String", featOkTst);
    casFeatCode_processorID  = (null == casFeat_processorID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_processorID).getCode();

  }
}



    