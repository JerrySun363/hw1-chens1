
/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
package hw1.type.input;

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

/** It combines the NGrams to a NGram list where each NGram in a list is generated by the same answer.</br> In this way, an Answer corresponds to exactly one NGram list.
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * @generated */
public class NGramList_Type extends General_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramList(addr, NGramList_Type.this);
  			   NGramList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramList(addr, NGramList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.type.input.NGramList");
 
  /** @generated */
  final Feature casFeat_NGrams;
  /** @generated */
  final int     casFeatCode_NGrams;
  /** @generated */ 
  public int getNGrams(int addr) {
        if (featOkTst && casFeat_NGrams == null)
      jcas.throwFeatMissing("NGrams", "hw1.type.input.NGramList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NGrams);
  }
  /** @generated */    
  public void setNGrams(int addr, int v) {
        if (featOkTst && casFeat_NGrams == null)
      jcas.throwFeatMissing("NGrams", "hw1.type.input.NGramList");
    ll_cas.ll_setRefValue(addr, casFeatCode_NGrams, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NGrams = jcas.getRequiredFeatureDE(casType, "NGrams", "uima.cas.FSList", featOkTst);
    casFeatCode_NGrams  = (null == casFeat_NGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NGrams).getCode();

  }
}



    