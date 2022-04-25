// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SharedVPCServiceProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final SharedVPCServiceProjectArgs Empty = new SharedVPCServiceProjectArgs();

    /**
     * The ID of a host project to associate.
     * 
     */
    @Import(name="hostProject", required=true)
    private Output<String> hostProject;

    /**
     * @return The ID of a host project to associate.
     * 
     */
    public Output<String> hostProject() {
        return this.hostProject;
    }

    /**
     * The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    @Import(name="serviceProject", required=true)
    private Output<String> serviceProject;

    /**
     * @return The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    public Output<String> serviceProject() {
        return this.serviceProject;
    }

    private SharedVPCServiceProjectArgs() {}

    private SharedVPCServiceProjectArgs(SharedVPCServiceProjectArgs $) {
        this.hostProject = $.hostProject;
        this.serviceProject = $.serviceProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedVPCServiceProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedVPCServiceProjectArgs $;

        public Builder() {
            $ = new SharedVPCServiceProjectArgs();
        }

        public Builder(SharedVPCServiceProjectArgs defaults) {
            $ = new SharedVPCServiceProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostProject The ID of a host project to associate.
         * 
         * @return builder
         * 
         */
        public Builder hostProject(Output<String> hostProject) {
            $.hostProject = hostProject;
            return this;
        }

        /**
         * @param hostProject The ID of a host project to associate.
         * 
         * @return builder
         * 
         */
        public Builder hostProject(String hostProject) {
            return hostProject(Output.of(hostProject));
        }

        /**
         * @param serviceProject The ID of the project that will serve as a Shared VPC service project.
         * 
         * @return builder
         * 
         */
        public Builder serviceProject(Output<String> serviceProject) {
            $.serviceProject = serviceProject;
            return this;
        }

        /**
         * @param serviceProject The ID of the project that will serve as a Shared VPC service project.
         * 
         * @return builder
         * 
         */
        public Builder serviceProject(String serviceProject) {
            return serviceProject(Output.of(serviceProject));
        }

        public SharedVPCServiceProjectArgs build() {
            $.hostProject = Objects.requireNonNull($.hostProject, "expected parameter 'hostProject' to be non-null");
            $.serviceProject = Objects.requireNonNull($.serviceProject, "expected parameter 'serviceProject' to be non-null");
            return $;
        }
    }

}
