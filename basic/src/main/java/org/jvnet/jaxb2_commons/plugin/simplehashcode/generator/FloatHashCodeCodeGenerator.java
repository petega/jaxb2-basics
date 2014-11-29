package org.jvnet.jaxb2_commons.plugin.simplehashcode.generator;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public class FloatHashCodeCodeGenerator extends
		PrimitiveHashCodeCodeGenerator {
	public FloatHashCodeCodeGenerator(JCodeModel codeModel) {
		super(codeModel);
	}

	@Override
	public JExpression hashCodeValue(JType type, JVar value) {
		return getCodeModel().ref(Float.class)
				.staticInvoke("floatToIntBits").arg(value);
	}
}