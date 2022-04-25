// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Reference to another Cloud SQL instance.
 * 
 */
public final class InstanceReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceReferenceResponse Empty = new InstanceReferenceResponse();

    /**
     * The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Cloud SQL instance being referenced. This does not include the project ID.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * The region of the Cloud SQL instance being referenced.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region of the Cloud SQL instance being referenced.
     * 
     */
    public String region() {
        return this.region;
    }

    private InstanceReferenceResponse() {}

    private InstanceReferenceResponse(InstanceReferenceResponse $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceReferenceResponse $;

        public Builder() {
            $ = new InstanceReferenceResponse();
        }

        public Builder(InstanceReferenceResponse defaults) {
            $ = new InstanceReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Cloud SQL instance being referenced. This does not include the project ID.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project ID of the Cloud SQL instance being referenced. The default is the same project ID as the instance references it.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region of the Cloud SQL instance being referenced.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public InstanceReferenceResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
