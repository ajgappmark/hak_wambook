/*
 * Copyright The Sett Ltd, 2005 to 2014.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thesett.aima.logic.fol.wam.builtins;

import com.thesett.aima.logic.fol.Functor;
import com.thesett.aima.logic.fol.FunctorName;
import com.thesett.aima.logic.fol.wam.compiler.DefaultBuiltIn;
import com.thesett.aima.logic.fol.wam.compiler.WAMInstruction;
import com.thesett.common.util.SizeableLinkedList;

/**
 * BaseBuiltIn provides a base-class on which built-in predicates may be implemented.
 *
 * <pre></p><table id="crc"><caption>CRC Card</caption>
 * <tr><th> Responsibilities <th> Collaborations
 * </table></pre>
 *
 * @author Rupert Smith
 */
public abstract class BaseBuiltIn extends BuiltInFunctor
{
    /** Holds the default built in, for standard compilation and interners and symbol tables. */
    protected final DefaultBuiltIn defaultBuiltIn;

    /**
     * Creates the base built in on the specified functor.
     *
     * @param functor        The functor to create a built-in for.
     * @param defaultBuiltIn The default built in, for standard compilation and interners and symbol tables.
     */
    protected BaseBuiltIn(Functor functor, DefaultBuiltIn defaultBuiltIn)
    {
        super(functor);

        this.defaultBuiltIn = defaultBuiltIn;
    }

    /** {@inheritDoc} */
    public SizeableLinkedList<WAMInstruction> compileBodyArguments(Functor expression, boolean isFirstBody,
        FunctorName clauseName, int bodyNumber)
    {
        return null;
    }

    /** {@inheritDoc} */
    public SizeableLinkedList<WAMInstruction> compileBodyCall(Functor expression, boolean isFirstBody,
        boolean isLastBody, boolean chainRule, int permVarsRemaining)
    {
        return null;
    }
}
