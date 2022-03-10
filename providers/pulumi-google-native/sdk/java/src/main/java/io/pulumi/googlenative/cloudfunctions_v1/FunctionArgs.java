// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudfunctions_v1.enums.FunctionIngressSettings;
import io.pulumi.googlenative.cloudfunctions_v1.enums.FunctionVpcConnectorEgressSettings;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.EventTriggerArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.HttpsTriggerArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SecretEnvVarArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SecretVolumeArgs;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SourceRepositoryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * The amount of memory in MB available for a function. Defaults to 256MB.
     * 
     */
    @InputImport(name="availableMemoryMb")
      private final @Nullable Input<Integer> availableMemoryMb;

    public Input<Integer> getAvailableMemoryMb() {
        return this.availableMemoryMb == null ? Input.empty() : this.availableMemoryMb;
    }

    /**
     * Build environment variables that shall be available during build time.
     * 
     */
    @InputImport(name="buildEnvironmentVariables")
      private final @Nullable Input<Map<String,String>> buildEnvironmentVariables;

    public Input<Map<String,String>> getBuildEnvironmentVariables() {
        return this.buildEnvironmentVariables == null ? Input.empty() : this.buildEnvironmentVariables;
    }

    /**
     * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where `{project}` and `{region}` are the project id and region respectively where the worker pool is defined and `{workerPool}` is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (`service-@gcf-admin-robot.iam.gserviceaccount.com`) must be granted the role Cloud Build Custom Workers Builder (`roles/cloudbuild.customworkers.builder`) in the project.
     * 
     */
    @InputImport(name="buildWorkerPool")
      private final @Nullable Input<String> buildWorkerPool;

    public Input<String> getBuildWorkerPool() {
        return this.buildWorkerPool == null ? Input.empty() : this.buildWorkerPool;
    }

    /**
     * User-provided description of a function.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. If unspecified and the deployment is eligible to use Artifact Registry, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
     * 
     */
    @InputImport(name="dockerRepository")
      private final @Nullable Input<String> dockerRepository;

    public Input<String> getDockerRepository() {
        return this.dockerRepository == null ? Input.empty() : this.dockerRepository;
    }

    /**
     * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
     * 
     */
    @InputImport(name="entryPoint")
      private final @Nullable Input<String> entryPoint;

    public Input<String> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    /**
     * Environment variables that shall be available during function execution.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * A source that fires events in response to a condition in another service.
     * 
     */
    @InputImport(name="eventTrigger")
      private final @Nullable Input<EventTriggerArgs> eventTrigger;

    public Input<EventTriggerArgs> getEventTrigger() {
        return this.eventTrigger == null ? Input.empty() : this.eventTrigger;
    }

    /**
     * An HTTPS endpoint type of source that can be triggered via URL.
     * 
     */
    @InputImport(name="httpsTrigger")
      private final @Nullable Input<HttpsTriggerArgs> httpsTrigger;

    public Input<HttpsTriggerArgs> getHttpsTrigger() {
        return this.httpsTrigger == null ? Input.empty() : this.httpsTrigger;
    }

    /**
     * The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    @InputImport(name="ingressSettings")
      private final @Nullable Input<FunctionIngressSettings> ingressSettings;

    public Input<FunctionIngressSettings> getIngressSettings() {
        return this.ingressSettings == null ? Input.empty() : this.ingressSettings;
    }

    /**
     * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. The following service accounts need to be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). 1. Google Cloud Functions service account (service-{project_number}@gcf-admin-robot.iam.gserviceaccount.com) - Required to protect the function's image. 2. Google Storage service account (service-{project_number}@gs-project-accounts.iam.gserviceaccount.com) - Required to protect the function's source code. If this service account does not exist, deploying a function without a KMS key or retrieving the service agent name provisions it. For more information, see https://cloud.google.com/storage/docs/projects#service-agents and https://cloud.google.com/storage/docs/getting-service-agent#gsutil. Google Cloud Functions delegates access to service agents to protect function resources in internal projects that are not accessible by the end user.
     * 
     */
    @InputImport(name="kmsKeyName")
      private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * Labels associated with this Cloud Function.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    @InputImport(name="maxInstances")
      private final @Nullable Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances == null ? Input.empty() : this.maxInstances;
    }

    /**
     * A lower bound for the number function instances that may coexist at a given time.
     * 
     */
    @InputImport(name="minInstances")
      private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    /**
     * A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either `projects/{project}/global/networks/{network}` or `{network}`, where `{project}` is a project id where the network is defined, and `{network}` is the short name of the network. This field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
     * 
     */
    @InputImport(name="runtime")
      private final @Nullable Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * Secret environment variables configuration.
     * 
     */
    @InputImport(name="secretEnvironmentVariables")
      private final @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables;

    public Input<List<SecretEnvVarArgs>> getSecretEnvironmentVariables() {
        return this.secretEnvironmentVariables == null ? Input.empty() : this.secretEnvironmentVariables;
    }

    /**
     * Secret volumes configuration.
     * 
     */
    @InputImport(name="secretVolumes")
      private final @Nullable Input<List<SecretVolumeArgs>> secretVolumes;

    public Input<List<SecretVolumeArgs>> getSecretVolumes() {
        return this.secretVolumes == null ? Input.empty() : this.secretVolumes;
    }

    /**
     * The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`.
     * 
     */
    @InputImport(name="serviceAccountEmail")
      private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip archive which contains the function.
     * 
     */
    @InputImport(name="sourceArchiveUrl")
      private final @Nullable Input<String> sourceArchiveUrl;

    public Input<String> getSourceArchiveUrl() {
        return this.sourceArchiveUrl == null ? Input.empty() : this.sourceArchiveUrl;
    }

    /**
     * **Beta Feature** The source repository where a function is hosted.
     * 
     */
    @InputImport(name="sourceRepository")
      private final @Nullable Input<SourceRepositoryArgs> sourceRepository;

    public Input<SourceRepositoryArgs> getSourceRepository() {
        return this.sourceRepository == null ? Input.empty() : this.sourceRepository;
    }

    /**
     * Input only. An identifier for Firebase function sources. Disclaimer: This field is only supported for Firebase function deployments.
     * 
     */
    @InputImport(name="sourceToken")
      private final @Nullable Input<String> sourceToken;

    public Input<String> getSourceToken() {
        return this.sourceToken == null ? Input.empty() : this.sourceToken;
    }

    /**
     * The Google Cloud Storage signed URL used for source uploading, generated by calling [google.cloud.functions.v1.GenerateUploadUrl]. The signature is validated on write methods (Create, Update) The signature is stripped from the Function object on read methods (Get, List)
     * 
     */
    @InputImport(name="sourceUploadUrl")
      private final @Nullable Input<String> sourceUploadUrl;

    public Input<String> getSourceUploadUrl() {
        return this.sourceUploadUrl == null ? Input.empty() : this.sourceUploadUrl;
    }

    /**
     * The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @InputImport(name="vpcConnector")
      private final @Nullable Input<String> vpcConnector;

    public Input<String> getVpcConnector() {
        return this.vpcConnector == null ? Input.empty() : this.vpcConnector;
    }

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    @InputImport(name="vpcConnectorEgressSettings")
      private final @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

    public Input<FunctionVpcConnectorEgressSettings> getVpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings == null ? Input.empty() : this.vpcConnectorEgressSettings;
    }

    public FunctionArgs(
        @Nullable Input<Integer> availableMemoryMb,
        @Nullable Input<Map<String,String>> buildEnvironmentVariables,
        @Nullable Input<String> buildWorkerPool,
        @Nullable Input<String> description,
        @Nullable Input<String> dockerRepository,
        @Nullable Input<String> entryPoint,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<EventTriggerArgs> eventTrigger,
        @Nullable Input<HttpsTriggerArgs> httpsTrigger,
        @Nullable Input<FunctionIngressSettings> ingressSettings,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> runtime,
        @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables,
        @Nullable Input<List<SecretVolumeArgs>> secretVolumes,
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> sourceArchiveUrl,
        @Nullable Input<SourceRepositoryArgs> sourceRepository,
        @Nullable Input<String> sourceToken,
        @Nullable Input<String> sourceUploadUrl,
        @Nullable Input<String> timeout,
        @Nullable Input<String> vpcConnector,
        @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
        this.availableMemoryMb = availableMemoryMb;
        this.buildEnvironmentVariables = buildEnvironmentVariables;
        this.buildWorkerPool = buildWorkerPool;
        this.description = description;
        this.dockerRepository = dockerRepository;
        this.entryPoint = entryPoint;
        this.environmentVariables = environmentVariables;
        this.eventTrigger = eventTrigger;
        this.httpsTrigger = httpsTrigger;
        this.ingressSettings = ingressSettings;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.location = location;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.name = name;
        this.network = network;
        this.project = project;
        this.runtime = runtime;
        this.secretEnvironmentVariables = secretEnvironmentVariables;
        this.secretVolumes = secretVolumes;
        this.serviceAccountEmail = serviceAccountEmail;
        this.sourceArchiveUrl = sourceArchiveUrl;
        this.sourceRepository = sourceRepository;
        this.sourceToken = sourceToken;
        this.sourceUploadUrl = sourceUploadUrl;
        this.timeout = timeout;
        this.vpcConnector = vpcConnector;
        this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
    }

    private FunctionArgs() {
        this.availableMemoryMb = Input.empty();
        this.buildEnvironmentVariables = Input.empty();
        this.buildWorkerPool = Input.empty();
        this.description = Input.empty();
        this.dockerRepository = Input.empty();
        this.entryPoint = Input.empty();
        this.environmentVariables = Input.empty();
        this.eventTrigger = Input.empty();
        this.httpsTrigger = Input.empty();
        this.ingressSettings = Input.empty();
        this.kmsKeyName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.runtime = Input.empty();
        this.secretEnvironmentVariables = Input.empty();
        this.secretVolumes = Input.empty();
        this.serviceAccountEmail = Input.empty();
        this.sourceArchiveUrl = Input.empty();
        this.sourceRepository = Input.empty();
        this.sourceToken = Input.empty();
        this.sourceUploadUrl = Input.empty();
        this.timeout = Input.empty();
        this.vpcConnector = Input.empty();
        this.vpcConnectorEgressSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availableMemoryMb;
        private @Nullable Input<Map<String,String>> buildEnvironmentVariables;
        private @Nullable Input<String> buildWorkerPool;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dockerRepository;
        private @Nullable Input<String> entryPoint;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<EventTriggerArgs> eventTrigger;
        private @Nullable Input<HttpsTriggerArgs> httpsTrigger;
        private @Nullable Input<FunctionIngressSettings> ingressSettings;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> runtime;
        private @Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables;
        private @Nullable Input<List<SecretVolumeArgs>> secretVolumes;
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> sourceArchiveUrl;
        private @Nullable Input<SourceRepositoryArgs> sourceRepository;
        private @Nullable Input<String> sourceToken;
        private @Nullable Input<String> sourceUploadUrl;
        private @Nullable Input<String> timeout;
        private @Nullable Input<String> vpcConnector;
        private @Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryMb = defaults.availableMemoryMb;
    	      this.buildEnvironmentVariables = defaults.buildEnvironmentVariables;
    	      this.buildWorkerPool = defaults.buildWorkerPool;
    	      this.description = defaults.description;
    	      this.dockerRepository = defaults.dockerRepository;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventTrigger = defaults.eventTrigger;
    	      this.httpsTrigger = defaults.httpsTrigger;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.runtime = defaults.runtime;
    	      this.secretEnvironmentVariables = defaults.secretEnvironmentVariables;
    	      this.secretVolumes = defaults.secretVolumes;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.sourceArchiveUrl = defaults.sourceArchiveUrl;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.sourceToken = defaults.sourceToken;
    	      this.sourceUploadUrl = defaults.sourceUploadUrl;
    	      this.timeout = defaults.timeout;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpcConnectorEgressSettings = defaults.vpcConnectorEgressSettings;
        }

        public Builder availableMemoryMb(@Nullable Input<Integer> availableMemoryMb) {
            this.availableMemoryMb = availableMemoryMb;
            return this;
        }

        public Builder availableMemoryMb(@Nullable Integer availableMemoryMb) {
            this.availableMemoryMb = Input.ofNullable(availableMemoryMb);
            return this;
        }

        public Builder buildEnvironmentVariables(@Nullable Input<Map<String,String>> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }

        public Builder buildEnvironmentVariables(@Nullable Map<String,String> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = Input.ofNullable(buildEnvironmentVariables);
            return this;
        }

        public Builder buildWorkerPool(@Nullable Input<String> buildWorkerPool) {
            this.buildWorkerPool = buildWorkerPool;
            return this;
        }

        public Builder buildWorkerPool(@Nullable String buildWorkerPool) {
            this.buildWorkerPool = Input.ofNullable(buildWorkerPool);
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

        public Builder dockerRepository(@Nullable Input<String> dockerRepository) {
            this.dockerRepository = dockerRepository;
            return this;
        }

        public Builder dockerRepository(@Nullable String dockerRepository) {
            this.dockerRepository = Input.ofNullable(dockerRepository);
            return this;
        }

        public Builder entryPoint(@Nullable Input<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder entryPoint(@Nullable String entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder environmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder eventTrigger(@Nullable Input<EventTriggerArgs> eventTrigger) {
            this.eventTrigger = eventTrigger;
            return this;
        }

        public Builder eventTrigger(@Nullable EventTriggerArgs eventTrigger) {
            this.eventTrigger = Input.ofNullable(eventTrigger);
            return this;
        }

        public Builder httpsTrigger(@Nullable Input<HttpsTriggerArgs> httpsTrigger) {
            this.httpsTrigger = httpsTrigger;
            return this;
        }

        public Builder httpsTrigger(@Nullable HttpsTriggerArgs httpsTrigger) {
            this.httpsTrigger = Input.ofNullable(httpsTrigger);
            return this;
        }

        public Builder ingressSettings(@Nullable Input<FunctionIngressSettings> ingressSettings) {
            this.ingressSettings = ingressSettings;
            return this;
        }

        public Builder ingressSettings(@Nullable FunctionIngressSettings ingressSettings) {
            this.ingressSettings = Input.ofNullable(ingressSettings);
            return this;
        }

        public Builder kmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
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

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder maxInstances(@Nullable Input<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Input.ofNullable(maxInstances);
            return this;
        }

        public Builder minInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
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

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
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

        public Builder runtime(@Nullable Input<String> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder runtime(@Nullable String runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder secretEnvironmentVariables(@Nullable Input<List<SecretEnvVarArgs>> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }

        public Builder secretEnvironmentVariables(@Nullable List<SecretEnvVarArgs> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = Input.ofNullable(secretEnvironmentVariables);
            return this;
        }

        public Builder secretVolumes(@Nullable Input<List<SecretVolumeArgs>> secretVolumes) {
            this.secretVolumes = secretVolumes;
            return this;
        }

        public Builder secretVolumes(@Nullable List<SecretVolumeArgs> secretVolumes) {
            this.secretVolumes = Input.ofNullable(secretVolumes);
            return this;
        }

        public Builder serviceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder sourceArchiveUrl(@Nullable Input<String> sourceArchiveUrl) {
            this.sourceArchiveUrl = sourceArchiveUrl;
            return this;
        }

        public Builder sourceArchiveUrl(@Nullable String sourceArchiveUrl) {
            this.sourceArchiveUrl = Input.ofNullable(sourceArchiveUrl);
            return this;
        }

        public Builder sourceRepository(@Nullable Input<SourceRepositoryArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }

        public Builder sourceRepository(@Nullable SourceRepositoryArgs sourceRepository) {
            this.sourceRepository = Input.ofNullable(sourceRepository);
            return this;
        }

        public Builder sourceToken(@Nullable Input<String> sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        public Builder sourceToken(@Nullable String sourceToken) {
            this.sourceToken = Input.ofNullable(sourceToken);
            return this;
        }

        public Builder sourceUploadUrl(@Nullable Input<String> sourceUploadUrl) {
            this.sourceUploadUrl = sourceUploadUrl;
            return this;
        }

        public Builder sourceUploadUrl(@Nullable String sourceUploadUrl) {
            this.sourceUploadUrl = Input.ofNullable(sourceUploadUrl);
            return this;
        }

        public Builder timeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder vpcConnector(@Nullable Input<String> vpcConnector) {
            this.vpcConnector = vpcConnector;
            return this;
        }

        public Builder vpcConnector(@Nullable String vpcConnector) {
            this.vpcConnector = Input.ofNullable(vpcConnector);
            return this;
        }

        public Builder vpcConnectorEgressSettings(@Nullable Input<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        public Builder vpcConnectorEgressSettings(@Nullable FunctionVpcConnectorEgressSettings vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = Input.ofNullable(vpcConnectorEgressSettings);
            return this;
        }
        public FunctionArgs build() {
            return new FunctionArgs(availableMemoryMb, buildEnvironmentVariables, buildWorkerPool, description, dockerRepository, entryPoint, environmentVariables, eventTrigger, httpsTrigger, ingressSettings, kmsKeyName, labels, location, maxInstances, minInstances, name, network, project, runtime, secretEnvironmentVariables, secretVolumes, serviceAccountEmail, sourceArchiveUrl, sourceRepository, sourceToken, sourceUploadUrl, timeout, vpcConnector, vpcConnectorEgressSettings);
        }
    }
}
