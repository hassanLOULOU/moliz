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
public class LiteralIntegerPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.emf.ecore.EModelElement element, ConversionResultImpl result) {
			
		if (!(element instanceof org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralInteger) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.LiteralInteger)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.LiteralInteger fumlNamedElement = (fUML.Syntax.Classes.Kernel.LiteralInteger) fumlElement;
		org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralInteger xmofElement = (org.modelexecution.xmof.Syntax.Classes.Kernel.LiteralInteger) element;
		
		fumlNamedElement.setValue(xmofElement.getValue());
		
	}
	
}
