/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020-2023 Polystat.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.polystat.symex;

import java.util.Arrays;

/**
 * CLI for Symex.
 *
 * @since 1.0
 */
public final class SymexCli {

    /**
     * Hiding ctor.
     */
    private SymexCli() {
    }

    /**
     * CLI entry point.
     * @param args Parameters
     */
    @SuppressWarnings({"PMD.SystemPrintln", "PMD.ProhibitPublicStaticMethods"})
    public static void main(final String[] args) {
        System.out.printf(
            "Parameters:\n%s",
            Arrays.toString(args)
        );
    }
}
