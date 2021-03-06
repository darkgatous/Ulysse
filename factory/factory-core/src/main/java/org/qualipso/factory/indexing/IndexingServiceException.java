/*
 *
 * Qualipso Factory
 * Copyright (C) 2006-2010 INRIA
 * http://www.inria.fr - molli@loria.fr
 *
 * This software is free software; you can redistribute it and/or
 * modify it under the terms of LGPL. See licenses details in LGPL.txt
 *
 * Initial authors :
 *
 * Jérôme Blanchard / INRIA
 * Pascal Molli / Nancy Université
 * Gérald Oster / Nancy Université
 *
 */
package org.qualipso.factory.indexing;

import org.qualipso.factory.FactoryException;


/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 20 May 2009
 */
@SuppressWarnings("serial")
public class IndexingServiceException extends FactoryException {
    public IndexingServiceException(String message, Exception rootCause) {
        super(message, rootCause);
    }

    public IndexingServiceException(String message) {
        super(message);
    }

    public IndexingServiceException(Exception rootCause) {
        super(rootCause);
    }
}
