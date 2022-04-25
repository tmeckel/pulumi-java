// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2ContainerResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2RevisionScalingResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VolumeResponse;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VpcAccessResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * RevisionTemplate describes the data a revision should have when created from a template.
 * 
 */
public final class GoogleCloudRunOpV2RevisionTemplateResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2RevisionTemplateResponse Empty = new GoogleCloudRunOpV2RevisionTemplateResponse();

    /**
     * KRM-style annotations for the resource.
     * 
     */
    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    /**
     * @return KRM-style annotations for the resource.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    @Import(name="confidential", required=true)
    private Boolean confidential;

    /**
     * @return Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    public Boolean confidential() {
        return this.confidential;
    }

    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    @Import(name="containerConcurrency", required=true)
    private Integer containerConcurrency;

    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    public Integer containerConcurrency() {
        return this.containerConcurrency;
    }

    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    @Import(name="containers", required=true)
    private List<GoogleCloudRunOpV2ContainerResponse> containers;

    /**
     * @return Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    public List<GoogleCloudRunOpV2ContainerResponse> containers() {
        return this.containers;
    }

    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    @Import(name="encryptionKey", required=true)
    private String encryptionKey;

    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * The sandbox environment to host this Revision.
     * 
     */
    @Import(name="executionEnvironment", required=true)
    private String executionEnvironment;

    /**
     * @return The sandbox environment to host this Revision.
     * 
     */
    public String executionEnvironment() {
        return this.executionEnvironment;
    }

    /**
     * KRM-style labels for the resource.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return KRM-style labels for the resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    @Import(name="revision", required=true)
    private String revision;

    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    public String revision() {
        return this.revision;
    }

    /**
     * Scaling settings for this Revision.
     * 
     */
    @Import(name="scaling", required=true)
    private GoogleCloudRunOpV2RevisionScalingResponse scaling;

    /**
     * @return Scaling settings for this Revision.
     * 
     */
    public GoogleCloudRunOpV2RevisionScalingResponse scaling() {
        return this.scaling;
    }

    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    @Import(name="serviceAccount", required=true)
    private String serviceAccount;

    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Max allowed time for an instance to respond to a request.
     * 
     */
    @Import(name="timeout", required=true)
    private String timeout;

    /**
     * @return Max allowed time for an instance to respond to a request.
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * A list of Volumes to make available to containers.
     * 
     */
    @Import(name="volumes", required=true)
    private List<GoogleCloudRunOpV2VolumeResponse> volumes;

    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    public List<GoogleCloudRunOpV2VolumeResponse> volumes() {
        return this.volumes;
    }

    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    @Import(name="vpcAccess", required=true)
    private GoogleCloudRunOpV2VpcAccessResponse vpcAccess;

    /**
     * @return VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    public GoogleCloudRunOpV2VpcAccessResponse vpcAccess() {
        return this.vpcAccess;
    }

    private GoogleCloudRunOpV2RevisionTemplateResponse() {}

    private GoogleCloudRunOpV2RevisionTemplateResponse(GoogleCloudRunOpV2RevisionTemplateResponse $) {
        this.annotations = $.annotations;
        this.confidential = $.confidential;
        this.containerConcurrency = $.containerConcurrency;
        this.containers = $.containers;
        this.encryptionKey = $.encryptionKey;
        this.executionEnvironment = $.executionEnvironment;
        this.labels = $.labels;
        this.revision = $.revision;
        this.scaling = $.scaling;
        this.serviceAccount = $.serviceAccount;
        this.timeout = $.timeout;
        this.volumes = $.volumes;
        this.vpcAccess = $.vpcAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2RevisionTemplateResponse $;

        public Builder() {
            $ = new GoogleCloudRunOpV2RevisionTemplateResponse();
        }

        public Builder(GoogleCloudRunOpV2RevisionTemplateResponse defaults) {
            $ = new GoogleCloudRunOpV2RevisionTemplateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations KRM-style annotations for the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param confidential Enables Confidential Cloud Run in Revisions created using this template.
         * 
         * @return builder
         * 
         */
        public Builder confidential(Boolean confidential) {
            $.confidential = confidential;
            return this;
        }

        /**
         * @param containerConcurrency Sets the maximum number of requests that each serving instance can receive.
         * 
         * @return builder
         * 
         */
        public Builder containerConcurrency(Integer containerConcurrency) {
            $.containerConcurrency = containerConcurrency;
            return this;
        }

        /**
         * @param containers Holds the single container that defines the unit of execution for this Revision.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<GoogleCloudRunOpV2ContainerResponse> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers Holds the single container that defines the unit of execution for this Revision.
         * 
         * @return builder
         * 
         */
        public Builder containers(GoogleCloudRunOpV2ContainerResponse... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param encryptionKey A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param executionEnvironment The sandbox environment to host this Revision.
         * 
         * @return builder
         * 
         */
        public Builder executionEnvironment(String executionEnvironment) {
            $.executionEnvironment = executionEnvironment;
            return this;
        }

        /**
         * @param labels KRM-style labels for the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param revision The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param scaling Scaling settings for this Revision.
         * 
         * @return builder
         * 
         */
        public Builder scaling(GoogleCloudRunOpV2RevisionScalingResponse scaling) {
            $.scaling = scaling;
            return this;
        }

        /**
         * @param serviceAccount Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param timeout Max allowed time for an instance to respond to a request.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param volumes A list of Volumes to make available to containers.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<GoogleCloudRunOpV2VolumeResponse> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes A list of Volumes to make available to containers.
         * 
         * @return builder
         * 
         */
        public Builder volumes(GoogleCloudRunOpV2VolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }

        /**
         * @param vpcAccess VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccess(GoogleCloudRunOpV2VpcAccessResponse vpcAccess) {
            $.vpcAccess = vpcAccess;
            return this;
        }

        public GoogleCloudRunOpV2RevisionTemplateResponse build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.confidential = Objects.requireNonNull($.confidential, "expected parameter 'confidential' to be non-null");
            $.containerConcurrency = Objects.requireNonNull($.containerConcurrency, "expected parameter 'containerConcurrency' to be non-null");
            $.containers = Objects.requireNonNull($.containers, "expected parameter 'containers' to be non-null");
            $.encryptionKey = Objects.requireNonNull($.encryptionKey, "expected parameter 'encryptionKey' to be non-null");
            $.executionEnvironment = Objects.requireNonNull($.executionEnvironment, "expected parameter 'executionEnvironment' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            $.scaling = Objects.requireNonNull($.scaling, "expected parameter 'scaling' to be non-null");
            $.serviceAccount = Objects.requireNonNull($.serviceAccount, "expected parameter 'serviceAccount' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            $.volumes = Objects.requireNonNull($.volumes, "expected parameter 'volumes' to be non-null");
            $.vpcAccess = Objects.requireNonNull($.vpcAccess, "expected parameter 'vpcAccess' to be non-null");
            return $;
        }
    }

}
