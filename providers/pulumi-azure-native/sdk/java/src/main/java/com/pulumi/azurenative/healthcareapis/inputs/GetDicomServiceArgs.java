// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDicomServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDicomServiceArgs Empty = new GetDicomServiceArgs();

    /**
     * The name of DICOM Service resource.
     * 
     */
    @Import(name="dicomServiceName", required=true)
    private String dicomServiceName;

    /**
     * @return The name of DICOM Service resource.
     * 
     */
    public String dicomServiceName() {
        return this.dicomServiceName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of workspace resource.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetDicomServiceArgs() {}

    private GetDicomServiceArgs(GetDicomServiceArgs $) {
        this.dicomServiceName = $.dicomServiceName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDicomServiceArgs $;

        public Builder() {
            $ = new GetDicomServiceArgs();
        }

        public Builder(GetDicomServiceArgs defaults) {
            $ = new GetDicomServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dicomServiceName The name of DICOM Service resource.
         * 
         * @return builder
         * 
         */
        public Builder dicomServiceName(String dicomServiceName) {
            $.dicomServiceName = dicomServiceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetDicomServiceArgs build() {
            $.dicomServiceName = Objects.requireNonNull($.dicomServiceName, "expected parameter 'dicomServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
