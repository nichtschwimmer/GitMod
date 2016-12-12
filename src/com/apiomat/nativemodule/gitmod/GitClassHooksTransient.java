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

public class GitClassHooksTransient<T extends GitClass> implements IModelHooksTransient<GitClass>
{
    protected GitClass model;

    @Override
    public void setCallingModel( GitClass model )
    {
        this.model = model;
    }



    /*
     * do-Methods can be used if your data model is set to TRANSIENT
     */

    @Override
    public String doPost( GitClass obj, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return null;
    }

    @Override
    public void doPut( GitClass obj, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
    }

    @Override
    public GitClass doGet( String foreignId, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return null;
    }

    @Override
    public boolean doDelete( String foreignId, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return false;
    }

    @Override
    public List<GitClass> doGetAll( String query, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return null;
    }

    @Override
    public long doCountAll( String query, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return 0;
    }

    /*
     * Please note: Before doPostRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doPostRef( Object referencedObject, String referenceName, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
    }

    /*
     * Please note: Before doDeleteRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doDeleteRef( String refName, String refForeignId, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
    }

    /*
     * Please note: Before doGetRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public <Z extends AbstractClientDataModel> List<Z> doGetRef( String refName, String query, Request r )
    {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	GitMod.AOM.logError( r.getApplicationName( ), "hello from method " + methodName );
        return null;
    }
}
