

/* First created by JCasGen Wed Sep 11 22:12:28 EDT 2013 */
package hw1.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is a base type inherited by all the types.</br>
It should include all the shared features the types in the system has.</br>
 * Updated by JCasGen Wed Sep 11 22:12:28 EDT 2013
 * XML source: /home/jerry/git/hw1-chens1/hw1-chens1/src/main/resources/TypeSystem.xml
 * @generated */
public class General extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(General.class);
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
  protected General() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public General(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public General(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public General(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets This indicates the confidence we have when we set a cas object a type.</br>
Confidence may have a value of [0,1].
   * @generated */
  public double getConfidence() {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.type.General");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((General_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets This indicates the confidence we have when we set a cas object a type.</br>
Confidence may have a value of [0,1]. 
   * @generated */
  public void setConfidence(double v) {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.type.General");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((General_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: processorID

  /** getter for processorID - gets A type should also tell  who creates the Object instance by using the processor id to distinguish.</br>
   * @generated */
  public String getProcessorID() {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_processorID == null)
      jcasType.jcas.throwFeatMissing("processorID", "hw1.type.General");
    return jcasType.ll_cas.ll_getStringValue(addr, ((General_Type)jcasType).casFeatCode_processorID);}
    
  /** setter for processorID - sets A type should also tell  who creates the Object instance by using the processor id to distinguish.</br> 
   * @generated */
  public void setProcessorID(String v) {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_processorID == null)
      jcasType.jcas.throwFeatMissing("processorID", "hw1.type.General");
    jcasType.ll_cas.ll_setStringValue(addr, ((General_Type)jcasType).casFeatCode_processorID, v);}    
  }

    