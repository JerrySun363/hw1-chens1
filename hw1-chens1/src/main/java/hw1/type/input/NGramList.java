

/* First created by JCasGen Tue Sep 10 00:55:27 EDT 2013 */
package hw1.type.input;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import hw1.type.General;
import org.apache.uima.jcas.cas.FSList;


/** A Question should be converted to a NGramList since there might be more than one interpretation of NGrams to consider. A NGramList should consist all the NGrams one sentence may generate.
 * Updated by JCasGen Tue Sep 10 00:56:01 EDT 2013
 * XML source: /home/jerry/git/hw1-chens1/hw1-chens1/src/main/resources/hw1-chens1-typesystem.xml
 * @generated */
public class NGramList extends General {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramList.class);
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
  protected NGramList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramList(JCas jcas, int begin, int end) {
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
  //* Feature: NGram

  /** getter for NGram - gets 
   * @generated */
  public FSList getNGram() {
    if (NGramList_Type.featOkTst && ((NGramList_Type)jcasType).casFeat_NGram == null)
      jcasType.jcas.throwFeatMissing("NGram", "hw1.type.input.NGramList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramList_Type)jcasType).casFeatCode_NGram)));}
    
  /** setter for NGram - sets  
   * @generated */
  public void setNGram(FSList v) {
    if (NGramList_Type.featOkTst && ((NGramList_Type)jcasType).casFeat_NGram == null)
      jcasType.jcas.throwFeatMissing("NGram", "hw1.type.input.NGramList");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramList_Type)jcasType).casFeatCode_NGram, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    