/*
 * DocumentAdapter.java
 *
 * Created on May 8, 2001, 2:55 PM
 */

package org.infohazard.domify2;

import org.apache.log4j.Category;
import org.w3c.dom.*;

/**
 * @author  Scott Hernandez
 */
public class DocumentAdapter extends NodeAdapter implements Document
{
	/** Logging category for log4j. */
	protected static Category log = Category.getInstance(DocumentAdapter.class.getName());

	/**
	 */
	Element root;

	protected DocumentAdapter(Object rootObj, String name, DOMAdapter domAdp )
	{
		super(null, 0);

		log.debug("Creating DocumentAdapter");

		this.root = new ElementAdapter(rootObj, name, this, 0, domAdp);
	}

	public short getNodeType()
	{
		log.debug("getNodeType()");

		return DOCUMENT_NODE;
	}

	/**
	 */
	public Element getDocumentElement()
	{
		log.debug("getDocumentElement()");
		return this.root;
	}
	/**
	 */
	public Node getFirstChild()
	{
		log.debug("getFirstChild()");
		return this.root;
	}

	/**
	 * hmmm....
	 */
	public String getLocalName()
	{
		if (log.isDebugEnabled())
			log.debug("getLocalName() returning " + root.getLocalName());

		return root.getLocalName();
	}

	@Override
	public String getBaseURI() {
		return null;
	}

	@Override
	public short compareDocumentPosition(Node other) throws DOMException {
		return 0;
	}

	@Override
	public String getTextContent() throws DOMException {
		return null;
	}

	@Override
	public void setTextContent(String textContent) throws DOMException {

	}

	@Override
	public boolean isSameNode(Node other) {
		return false;
	}

	@Override
	public String lookupPrefix(String namespaceURI) {
		return null;
	}

	@Override
	public boolean isDefaultNamespace(String namespaceURI) {
		return false;
	}

	@Override
	public String lookupNamespaceURI(String prefix) {
		return null;
	}

	@Override
	public boolean isEqualNode(Node arg) {
		return false;
	}

	@Override
	public Object getFeature(String feature, String version) {
		return null;
	}

	@Override
	public Object setUserData(String key, Object data, UserDataHandler handler) {
		return null;
	}

	@Override
	public Object getUserData(String key) {
		return null;
	}

	/**
	 * Returns whether this node has any children.
	 * @return  <code>true</code> if this node has any children,
	 *   <code>false</code> otherwise.
	 *
	 * Document nodes always have children.
	 */
	public boolean hasChildNodes()
	{
		if (log.isDebugEnabled())
			log.debug("hasChildNodes() is true");
		return true;
	}

	public NodeList getElementsByTagNameNS(String str, String str1)
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public ProcessingInstruction createProcessingInstruction(String str, String str1) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Element createElement(String str) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public NodeList getElementsByTagName(String str)
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Attr createAttribute(String str) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Element createElementNS(String str, String str1) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Element getElementById(String str)
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	@Override
	public String getInputEncoding() {
		return null;
	}

	@Override
	public String getXmlEncoding() {
		return null;
	}

	@Override
	public boolean getXmlStandalone() {
		return false;
	}

	@Override
	public void setXmlStandalone(boolean xmlStandalone) throws DOMException {

	}

	@Override
	public String getXmlVersion() {
		return null;
	}

	@Override
	public void setXmlVersion(String xmlVersion) throws DOMException {

	}

	@Override
	public boolean getStrictErrorChecking() {
		return false;
	}

	@Override
	public void setStrictErrorChecking(boolean strictErrorChecking) {

	}

	@Override
	public String getDocumentURI() {
		return null;
	}

	@Override
	public void setDocumentURI(String documentURI) {

	}

	@Override
	public Node adoptNode(Node source) throws DOMException {
		return null;
	}

	@Override
	public DOMConfiguration getDomConfig() {
		return null;
	}

	@Override
	public void normalizeDocument() {

	}

	@Override
	public Node renameNode(Node n, String namespaceURI, String qualifiedName) throws DOMException {
		return null;
	}

	public Text createTextNode(String str)
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public CDATASection createCDATASection(String str) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public EntityReference createEntityReference(String str) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Attr createAttributeNS(String str, String str1) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public DocumentType getDoctype()
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public DOMImplementation getImplementation()
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Node importNode(Node node, boolean param) throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public DocumentFragment createDocumentFragment()
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public Comment createComment(String str)
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}

	public String getNodeValue() throws DOMException
	{
		System.out.println("UnsupportedOperationException Thrown");throw new UnsupportedOperationException();
	}




	/**
	 * @see org.w3c.dom.Node#supports(String, String)
	 */
	public boolean supports(String arg0, String arg1) {
		throw new UnsupportedOperationException("supports");
	}

}
