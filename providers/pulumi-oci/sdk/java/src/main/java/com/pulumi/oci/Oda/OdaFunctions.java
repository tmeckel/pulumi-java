// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oda;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Oda.inputs.GetOdaInstanceArgs;
import com.pulumi.oci.Oda.inputs.GetOdaInstancesArgs;
import com.pulumi.oci.Oda.outputs.GetOdaInstanceResult;
import com.pulumi.oci.Oda.outputs.GetOdaInstancesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class OdaFunctions {
    /**
     * This data source provides details about a specific Oda Instance resource in Oracle Cloud Infrastructure Digital Assistant service.
     * 
     * Gets the specified Digital Assistant instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOdaInstanceResult> getOdaInstance(GetOdaInstanceArgs args) {
        return getOdaInstance(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Oda Instance resource in Oracle Cloud Infrastructure Digital Assistant service.
     * 
     * Gets the specified Digital Assistant instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOdaInstanceResult> getOdaInstance(GetOdaInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Oda/getOdaInstance:getOdaInstance", TypeShape.of(GetOdaInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Oda Instances in Oracle Cloud Infrastructure Digital Assistant service.
     * 
     * Returns a page of Digital Assistant instances that belong to the specified
     * compartment.
     * 
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header&#39;s value as the `page` query parameter.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOdaInstancesResult> getOdaInstances(GetOdaInstancesArgs args) {
        return getOdaInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Oda Instances in Oracle Cloud Infrastructure Digital Assistant service.
     * 
     * Returns a page of Digital Assistant instances that belong to the specified
     * compartment.
     * 
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header&#39;s value as the `page` query parameter.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOdaInstancesResult> getOdaInstances(GetOdaInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Oda/getOdaInstances:getOdaInstances", TypeShape.of(GetOdaInstancesResult.class), args, Utilities.withVersion(options));
    }
}
