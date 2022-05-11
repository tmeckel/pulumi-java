// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiVision;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.AiVision.inputs.GetModelArgs;
import com.pulumi.oci.AiVision.inputs.GetModelsArgs;
import com.pulumi.oci.AiVision.inputs.GetProjectArgs;
import com.pulumi.oci.AiVision.inputs.GetProjectsArgs;
import com.pulumi.oci.AiVision.outputs.GetModelResult;
import com.pulumi.oci.AiVision.outputs.GetModelsResult;
import com.pulumi.oci.AiVision.outputs.GetProjectResult;
import com.pulumi.oci.AiVision.outputs.GetProjectsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class AiVisionFunctions {
    /**
     * This data source provides details about a specific Model resource in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Gets a Model by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args) {
        return getModel(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Model resource in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Gets a Model by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetModelResult> getModel(GetModelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:AiVision/getModel:getModel", TypeShape.of(GetModelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Models in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Models.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetModelsResult> getModels() {
        return getModels(GetModelsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Models in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Models.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetModelsResult> getModels(GetModelsArgs args) {
        return getModels(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Models in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Models.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetModelsResult> getModels(GetModelsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:AiVision/getModels:getModels", TypeShape.of(GetModelsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Project resource in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Gets a Project by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Project resource in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Gets a Project by identifier
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:AiVision/getProject:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Projects in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Projects.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectsResult> getProjects() {
        return getProjects(GetProjectsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Projects in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Projects.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectsResult> getProjects(GetProjectsArgs args) {
        return getProjects(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Projects in Oracle Cloud Infrastructure Ai Vision service.
     * 
     * Returns a list of Projects.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProjectsResult> getProjects(GetProjectsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:AiVision/getProjects:getProjects", TypeShape.of(GetProjectsResult.class), args, Utilities.withVersion(options));
    }
}
