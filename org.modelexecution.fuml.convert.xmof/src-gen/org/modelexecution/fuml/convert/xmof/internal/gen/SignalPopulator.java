/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.xmof.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.xmof.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.xmof.gen.ElementPopulatorGenerator.xtend")
public class SignalPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.emf.ecore.EModelElement element, ConversionResultImpl result) {
			
		if (!(element instanceof org.modelexecution.xmof.Syntax.CommonBehaviors.Communications.Signal) ||
			!(fumlElement instanceof fUML.Syntax.CommonBehaviors.Communications.Signal)) {
			return;
		}
		
		fUML.Syntax.CommonBehaviors.Communications.Signal fumlNamedElement = (fUML.Syntax.CommonBehaviors.Communications.Signal) fumlElement;
		org.modelexecution.xmof.Syntax.CommonBehaviors.Communications.Signal xmofElement = (org.modelexecution.xmof.Syntax.CommonBehaviors.Communications.Signal) element;
		
		
		for (org.eclipse.emf.ecore.EAttribute value : xmofElement.getOwnedAttribute()) {
					fumlNamedElement.ownedAttribute.add((fUML.Syntax.Classes.Kernel.Property) result.getFUMLElement(value));
		}
		
		
	}
	
}
