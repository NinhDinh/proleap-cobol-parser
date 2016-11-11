/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.data.impl;

import java.util.ArrayList;
import java.util.List;

import io.proleap.cobol.Cobol85Parser.DataDescriptionEntryFormat1Context;
import io.proleap.cobol.parser.metamodel.CobolDivision;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.data.DataDescriptionEntry1;

public class DataDescriptionEntry1Impl extends DataDescriptionEntryImpl implements DataDescriptionEntry1 {

	protected final DataDescriptionEntryFormat1Context ctx;

	protected DataDescriptionEntry1 groupDataDescriptionEntry;

	protected List<DataDescriptionEntry1> groupedDataDescriptionEntries = new ArrayList<DataDescriptionEntry1>();

	public DataDescriptionEntry1Impl(final String name, final ProgramUnit programUnit, final CobolDivision scope,
			final DataDescriptionEntryFormat1Context ctx) {
		super(name, programUnit, scope, ctx);

		this.ctx = ctx;
	}

	@Override
	public void addGroupedDataDescriptionEntry(final DataDescriptionEntry1 dataDescriptionEntry) {
		groupedDataDescriptionEntries.add(dataDescriptionEntry);
	}

	@Override
	public DataDescriptionEntry1 getGroupDataDescriptionEntry() {
		return groupDataDescriptionEntry;
	}

	@Override
	public List<DataDescriptionEntry1> getGroupedDataDescriptionEntries() {
		return groupedDataDescriptionEntries;
	}

	@Override
	public void setGroupDataDescriptionEntry(final DataDescriptionEntry1 dataDescriptionEntry) {
		groupDataDescriptionEntry = dataDescriptionEntry;
	}

}
