/*
 * Copyright (c) 2011 - 2016, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.gitmod;

import java.util.*;

import com.apiomat.nativemodule.*;
import com.apiomat.nativemodule.basics.User;


/**
* Generated class for hooks on your GitClass data model
*/

public class GitClassHooksNonTransient<T extends GitClass> implements IModelHooksNonTransient<GitClass>
{
    protected GitClass model;

    @Override
    public void setCallingModel( GitClass model )
    {
        this.model = model;
    }


    /*
     * Following Methods can be used if your data model is NOT set to TRANSIENT
     */

    @Override
    public void beforePost( GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        GitMod.AOM.logError( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public void afterPost( GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public void beforeGet( GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public boolean beforePut( GitClass objFromDB, GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        return false;
    }

    @Override
    public void afterPut( GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public boolean beforeDelete( GitClass obj, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        return false;
    }

    @Override
    public List<GitClass> afterGetAll( List<GitClass> objects, String query, Request r )
    {
        /*
         * If you want to change the returned list of elements, you have to create a new list
         * and add the elements to return to it. Because getting elements from the "objects"
         * list will return a copy, changing values in this list does not have any effect.
         *
         * If NULL is returned, unnecessary conversions are omitted and result is taken from database.
         */
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        return null;
    }

    @Override
    public boolean beforePostRef( GitClass obj, Object referencedObject, String referenceName, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        return false;
    }

    @Override
    public void afterPostRef( GitClass obj, Object referencedObject, String referenceName, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public boolean beforeDeleteRef( GitClass obj, Object referencedObject, String referenceName, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
        return false;
    }

    @Override
    public void afterDeleteRef( GitClass obj, Object referencedObject, String referenceName, Request r )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( r.getApplicationName( ), "hello from " + method );
    }

    @Override
    public <Z extends AbstractClientDataModel> List<Z> afterGetAllReferences( List<Z> objects, String query,
        String referenceName, Request request )
    {
    	String method = new Object(){}.getClass().getEnclosingMethod().getName();
        GitMod.AOM.log( request.getApplicationName( ), "hello from " + method );
            return null; // return objects here if you changed sth; returning null prevents unnecessary conversions
    }
}
