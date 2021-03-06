package org.metaborg.spt.core.run;

import org.metaborg.core.language.ILanguageImpl;
import org.metaborg.core.syntax.ParseException;
import org.metaborg.mbt.core.model.IFragment;
import org.metaborg.mbt.core.run.IFragmentParser;
import org.metaborg.spoofax.core.unit.ISpoofaxParseUnit;

/**
 * Type interface for an IFragmentParser that will parse the fragment with a Spoofax language.
 */
public interface ISpoofaxFragmentParser extends IFragmentParser<ISpoofaxParseUnit> {

    ISpoofaxParseUnit parse(IFragment fragment, ILanguageImpl fragmentLanguage, ILanguageImpl dialect,
        ISpoofaxFragmentParserConfig config) throws ParseException;
}
