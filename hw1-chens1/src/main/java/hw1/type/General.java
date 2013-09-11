

/* First created by JCasGen Tue Sep 10 00:55:27 EDT 2013 */
package hw1.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** General Annotaion and the basic annotation including the basic elements from its supertype.</br>
 *  And it will also have confidence field since all the types includes it as a part.</br>
 * Updated by JCasGen Tue Sep 10 00:56:01 EDT 2013</br>
 * XML source: /home/jerry/git/hw1-chens1/hw1-chens1/src/main/resources/hw1-chens1-typesystem.xml</br>
 * This class should nevel have instances. It's better to see it as an interface.
 * @category baisc
 * @author Jerry Sun
 * @version 1.0 */
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

  /** getter for confidence - gets This field is shared by all the elements, so a general type could place it and other types may inherit this type.
   * @generated */
  public double getConfidence() {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.type.General");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((General_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets This field is shared by all the elements, so a general type could place it and other types may inherit this type. 
   * @generated */
  public void setConfidence(double v) {
    if (General_Type.featOkTst && ((General_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "hw1.type.General");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((General_Type)jcasType).casFeatCode_confidence, v);}    
  }

    