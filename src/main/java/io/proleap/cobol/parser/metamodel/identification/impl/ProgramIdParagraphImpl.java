/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.identification.impl;

import io.proleap.cobol.Cobol85Parser.ProgramIdParagraphContext;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.identification.ProgramIdParagraph;
import io.proleap.cobol.parser.metamodel.impl.CobolDivisionElementImpl;

public class ProgramIdParagraphImpl extends CobolDivisionElementImpl implements ProgramIdParagraph {

	protected Attribute attribute;

	protected final ProgramIdParagraphContext ctx;

	protected String name;

	public ProgramIdParagraphImpl(final String name, final ProgramUnit programUnit,
			final ProgramIdParagraphContext ctx) {
		super(programUnit, ctx);

		this.name = name;
		this.ctx = ctx;
	}

	@Override
	public Attribute getAttribute() {
		return attribute;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setAttribute(final Attribute attribute) {
		this.attribute = attribute;
	}

}