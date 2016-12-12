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
package com.apiomat.nativemodule.gitmod2;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import com.apiomat.nativemodule.IApplicationConfigProxy;
import com.apiomat.nativemodule.IModule;
import com.apiomat.nativemodule.Module;
import com.apiomat.nativemodule.IStaticMethods;
import com.apiomat.nativemodule.AbstractRestResource;

/**
 * Generated class for starting and stopping your module. 
 * 
 * Please be aware that all overridden methods in this class are called internally with 
 * A NEW INSTANCE OF THIS CLASS every time. That is, you cannot use instance variables 
 * in these overriden methods, because they are initialized again before each call.
 * 
 */
@Module( description="", 
         usedModules={}, securityPermissions = {} )
public class GitMod2 implements IModule
{
    static IApplicationConfigProxy APP_CONFIG_PROXY;
    static IStaticMethods AOM;
    
    // sample for a module configuration
    // @NativeModuleConfig(
    //     datatype = Type.TEXT,
    //     example = "localhost",
    //     title = "Server Hostname",
    //     info = "Hostname of the server",
    //     defaultValue = "localhost",
    //     order = 1 )
    // public static String HOSTNAME = "GitMod2_hostname";

    /**
     * This method gets called once in the cluster when the module is uploaded.
     */
    @Override
    public void onDeploy( )
    {
        //TODO will be called on SDK upload or service start
    }

    /**
     * This method gets called once in the cluster when the ApiOmat service is shutdown.
     */
    @Override
    public void onUndeploy( )
    {
        //TODO will be called when service shuts down (maintenance)
    }
    
    /**
     * This method gets called when the configuration for an app changes for this module
     */
    @Override
    public void onConfigChanged( String appName, String configKey, String system )
    {
        // TODO Auto-generated method stub
    }
    
    /**
     * This method may provide an implementation for your own REST interface
     */
    @Override
    public AbstractRestResource getSpecificRestResource( UriInfo uriInfo, HttpServletRequest servletRequest,
        SecurityContext securityContext, Request wsRequest )
    {
        // TODO comment in to use a basic rest endpoint with a ping method
        //return new RestClass( uriInfo, servletRequest, securityContext, wsRequest );
        return null;
    }
    
    /**
     * This method gets called every hour
     */
    @Override
    public void onCronHourly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every day
     */
    @Override
    public void onCronDaily( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every week
     */
    @Override
    public void onCronWeekly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every month
     */
    @Override
    public void onCronMonthly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }
}
