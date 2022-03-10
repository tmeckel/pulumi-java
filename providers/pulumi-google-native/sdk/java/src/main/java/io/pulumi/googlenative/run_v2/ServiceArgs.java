// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.enums.ServiceIngress;
import io.pulumi.googlenative.run_v2.enums.ServiceLaunchStage;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2BinaryAuthorizationArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2RevisionTemplateArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2TrafficTargetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects. Cloud Run will populate some annotations using 'run.googleapis.com' or 'serving.knative.dev' namespaces. This field follows Kubernetes annotations' namespacing, limits, and rules. More info: http://kubernetes.io/docs/user-guide/annotations
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Settings for the Binary Authorization feature.
     * 
     */
    @InputImport(name="binaryAuthorization")
      private final @Nullable Input<GoogleCloudRunOpV2BinaryAuthorizationArgs> binaryAuthorization;

    public Input<GoogleCloudRunOpV2BinaryAuthorizationArgs> getBinaryAuthorization() {
        return this.binaryAuthorization == null ? Input.empty() : this.binaryAuthorization;
    }

    /**
     * Arbitrary identifier for the API client.
     * 
     */
    @InputImport(name="client")
      private final @Nullable Input<String> client;

    public Input<String> getClient() {
        return this.client == null ? Input.empty() : this.client;
    }

    /**
     * Arbitrary version identifier for the API client.
     * 
     */
    @InputImport(name="clientVersion")
      private final @Nullable Input<String> clientVersion;

    public Input<String> getClientVersion() {
        return this.clientVersion == null ? Input.empty() : this.clientVersion;
    }

    /**
     * User-provided description of the Service.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Provides the ingress settings for this Service. On output, returns the currently observed ingress settings, or INGRESS_TRAFFIC_UNSPECIFIED if no revision is active.
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<ServiceIngress> ingress;

    public Input<ServiceIngress> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize objects. User-provided labels are shared with Google's billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev' namespaces. Those labels are read-only, and user changes will not be preserved.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The launch stage as defined by [Google Cloud Platform Launch Stages](http://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is specified, GA is assumed.
     * 
     */
    @InputImport(name="launchStage")
      private final @Nullable Input<ServiceLaunchStage> launchStage;

    public Input<ServiceLaunchStage> getLaunchStage() {
        return this.launchStage == null ? Input.empty() : this.launchStage;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The fully qualified name of this Service. In CreateServiceRequest, this field is ignored, and instead composed from CreateServiceRequest.parent and CreateServiceRequest.service_id. Format: projects/{project}/locations/{location}/services/{service_id}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="serviceId", required=true)
      private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    /**
     * The template used to create revisions for this Service.
     * 
     */
    @InputImport(name="template", required=true)
      private final Input<GoogleCloudRunOpV2RevisionTemplateArgs> template;

    public Input<GoogleCloudRunOpV2RevisionTemplateArgs> getTemplate() {
        return this.template;
    }

    /**
     * Specifies how to distribute traffic over a collection of Revisions belonging to the Service. If traffic is empty or not provided, defaults to 100% traffic to the latest `Ready` Revision.
     * 
     */
    @InputImport(name="traffic")
      private final @Nullable Input<List<GoogleCloudRunOpV2TrafficTargetArgs>> traffic;

    public Input<List<GoogleCloudRunOpV2TrafficTargetArgs>> getTraffic() {
        return this.traffic == null ? Input.empty() : this.traffic;
    }

    @InputImport(name="validateOnly")
      private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    public ServiceArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<GoogleCloudRunOpV2BinaryAuthorizationArgs> binaryAuthorization,
        @Nullable Input<String> client,
        @Nullable Input<String> clientVersion,
        @Nullable Input<String> description,
        @Nullable Input<ServiceIngress> ingress,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<ServiceLaunchStage> launchStage,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> serviceId,
        Input<GoogleCloudRunOpV2RevisionTemplateArgs> template,
        @Nullable Input<List<GoogleCloudRunOpV2TrafficTargetArgs>> traffic,
        @Nullable Input<String> validateOnly) {
        this.annotations = annotations;
        this.binaryAuthorization = binaryAuthorization;
        this.client = client;
        this.clientVersion = clientVersion;
        this.description = description;
        this.ingress = ingress;
        this.labels = labels;
        this.launchStage = launchStage;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.traffic = traffic;
        this.validateOnly = validateOnly;
    }

    private ServiceArgs() {
        this.annotations = Input.empty();
        this.binaryAuthorization = Input.empty();
        this.client = Input.empty();
        this.clientVersion = Input.empty();
        this.description = Input.empty();
        this.ingress = Input.empty();
        this.labels = Input.empty();
        this.launchStage = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serviceId = Input.empty();
        this.template = Input.empty();
        this.traffic = Input.empty();
        this.validateOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<GoogleCloudRunOpV2BinaryAuthorizationArgs> binaryAuthorization;
        private @Nullable Input<String> client;
        private @Nullable Input<String> clientVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<ServiceIngress> ingress;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<ServiceLaunchStage> launchStage;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> serviceId;
        private Input<GoogleCloudRunOpV2RevisionTemplateArgs> template;
        private @Nullable Input<List<GoogleCloudRunOpV2TrafficTargetArgs>> traffic;
        private @Nullable Input<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.binaryAuthorization = defaults.binaryAuthorization;
    	      this.client = defaults.client;
    	      this.clientVersion = defaults.clientVersion;
    	      this.description = defaults.description;
    	      this.ingress = defaults.ingress;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.template = defaults.template;
    	      this.traffic = defaults.traffic;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder annotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder binaryAuthorization(@Nullable Input<GoogleCloudRunOpV2BinaryAuthorizationArgs> binaryAuthorization) {
            this.binaryAuthorization = binaryAuthorization;
            return this;
        }

        public Builder binaryAuthorization(@Nullable GoogleCloudRunOpV2BinaryAuthorizationArgs binaryAuthorization) {
            this.binaryAuthorization = Input.ofNullable(binaryAuthorization);
            return this;
        }

        public Builder client(@Nullable Input<String> client) {
            this.client = client;
            return this;
        }

        public Builder client(@Nullable String client) {
            this.client = Input.ofNullable(client);
            return this;
        }

        public Builder clientVersion(@Nullable Input<String> clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        public Builder clientVersion(@Nullable String clientVersion) {
            this.clientVersion = Input.ofNullable(clientVersion);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ingress(@Nullable Input<ServiceIngress> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder ingress(@Nullable ServiceIngress ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder launchStage(@Nullable Input<ServiceLaunchStage> launchStage) {
            this.launchStage = launchStage;
            return this;
        }

        public Builder launchStage(@Nullable ServiceLaunchStage launchStage) {
            this.launchStage = Input.ofNullable(launchStage);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder serviceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }

        public Builder template(Input<GoogleCloudRunOpV2RevisionTemplateArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder template(GoogleCloudRunOpV2RevisionTemplateArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder traffic(@Nullable Input<List<GoogleCloudRunOpV2TrafficTargetArgs>> traffic) {
            this.traffic = traffic;
            return this;
        }

        public Builder traffic(@Nullable List<GoogleCloudRunOpV2TrafficTargetArgs> traffic) {
            this.traffic = Input.ofNullable(traffic);
            return this;
        }

        public Builder validateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(annotations, binaryAuthorization, client, clientVersion, description, ingress, labels, launchStage, location, name, project, serviceId, template, traffic, validateOnly);
        }
    }
}
