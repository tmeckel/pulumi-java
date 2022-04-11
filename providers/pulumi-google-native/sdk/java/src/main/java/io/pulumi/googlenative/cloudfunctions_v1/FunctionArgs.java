// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="availableMemoryMb")
      private final @Nullable Output<Integer> availableMemoryMb;

    public Output<Integer> getAvailableMemoryMb() {
        return this.availableMemoryMb == null ? Codegen.empty() : this.availableMemoryMb;
    }

    /**
     * Build environment variables that shall be available during build time.
     * 
     */
    @Import(name="buildEnvironmentVariables")
      private final @Nullable Output<Map<String,String>> buildEnvironmentVariables;

    public Output<Map<String,String>> getBuildEnvironmentVariables() {
        return this.buildEnvironmentVariables == null ? Codegen.empty() : this.buildEnvironmentVariables;
    }

    /**
     * Name of the Cloud Build Custom Worker Pool that should be used to build the function. The format of this field is `projects/{project}/locations/{region}/workerPools/{workerPool}` where `{project}` and `{region}` are the project id and region respectively where the worker pool is defined and `{workerPool}` is the short name of the worker pool. If the project id is not the same as the function, then the Cloud Functions Service Agent (`service-@gcf-admin-robot.iam.gserviceaccount.com`) must be granted the role Cloud Build Custom Workers Builder (`roles/cloudbuild.customworkers.builder`) in the project.
     * 
     */
    @Import(name="buildWorkerPool")
      private final @Nullable Output<String> buildWorkerPool;

    public Output<String> getBuildWorkerPool() {
        return this.buildWorkerPool == null ? Codegen.empty() : this.buildWorkerPool;
    }

    /**
     * User-provided description of a function.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. If unspecified and the deployment is eligible to use Artifact Registry, GCF will create and use a repository named 'gcf-artifacts' for every deployed region. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`. Cross-project repositories are not supported. Cross-location repositories are not supported. Repository format must be 'DOCKER'.
     * 
     */
    @Import(name="dockerRepository")
      private final @Nullable Output<String> dockerRepository;

    public Output<String> getDockerRepository() {
        return this.dockerRepository == null ? Codegen.empty() : this.dockerRepository;
    }

    /**
     * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
     * 
     */
    @Import(name="entryPoint")
      private final @Nullable Output<String> entryPoint;

    public Output<String> getEntryPoint() {
        return this.entryPoint == null ? Codegen.empty() : this.entryPoint;
    }

    /**
     * Environment variables that shall be available during function execution.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * A source that fires events in response to a condition in another service.
     * 
     */
    @Import(name="eventTrigger")
      private final @Nullable Output<EventTriggerArgs> eventTrigger;

    public Output<EventTriggerArgs> getEventTrigger() {
        return this.eventTrigger == null ? Codegen.empty() : this.eventTrigger;
    }

    /**
     * An HTTPS endpoint type of source that can be triggered via URL.
     * 
     */
    @Import(name="httpsTrigger")
      private final @Nullable Output<HttpsTriggerArgs> httpsTrigger;

    public Output<HttpsTriggerArgs> getHttpsTrigger() {
        return this.httpsTrigger == null ? Codegen.empty() : this.httpsTrigger;
    }

    /**
     * The ingress settings for the function, controlling what traffic can reach it.
     * 
     */
    @Import(name="ingressSettings")
      private final @Nullable Output<FunctionIngressSettings> ingressSettings;

    public Output<FunctionIngressSettings> getIngressSettings() {
        return this.ingressSettings == null ? Codegen.empty() : this.ingressSettings;
    }

    /**
     * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`. If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. The following service accounts need to be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). 1. Google Cloud Functions service account (service-{project_number}@gcf-admin-robot.iam.gserviceaccount.com) - Required to protect the function's image. 2. Google Storage service account (service-{project_number}@gs-project-accounts.iam.gserviceaccount.com) - Required to protect the function's source code. If this service account does not exist, deploying a function without a KMS key or retrieving the service agent name provisions it. For more information, see https://cloud.google.com/storage/docs/projects#service-agents and https://cloud.google.com/storage/docs/getting-service-agent#gsutil. Google Cloud Functions delegates access to service agents to protect function resources in internal projects that are not accessible by the end user.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * Labels associated with this Cloud Function.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time, create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
     * 
     */
    @Import(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Codegen.empty() : this.maxInstances;
    }

    /**
     * A lower bound for the number function instances that may coexist at a given time.
     * 
     */
    @Import(name="minInstances")
      private final @Nullable Output<Integer> minInstances;

    public Output<Integer> getMinInstances() {
        return this.minInstances == null ? Codegen.empty() : this.minInstances;
    }

    /**
     * A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either `projects/{project}/global/networks/{network}` or `{network}`, where `{project}` is a project id where the network is defined, and `{network}` is the short name of the network. This field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the [`gcloud` command reference](https://cloud.google.com/sdk/gcloud/reference/functions/deploy#--runtime).
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<String> runtime;

    public Output<String> getRuntime() {
        return this.runtime == null ? Codegen.empty() : this.runtime;
    }

    /**
     * Secret environment variables configuration.
     * 
     */
    @Import(name="secretEnvironmentVariables")
      private final @Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables;

    public Output<List<SecretEnvVarArgs>> getSecretEnvironmentVariables() {
        return this.secretEnvironmentVariables == null ? Codegen.empty() : this.secretEnvironmentVariables;
    }

    /**
     * Secret volumes configuration.
     * 
     */
    @Import(name="secretVolumes")
      private final @Nullable Output<List<SecretVolumeArgs>> secretVolumes;

    public Output<List<SecretVolumeArgs>> getSecretVolumes() {
        return this.secretVolumes == null ? Codegen.empty() : this.secretVolumes;
    }

    /**
     * The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`.
     * 
     */
    @Import(name="serviceAccountEmail")
      private final @Nullable Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Codegen.empty() : this.serviceAccountEmail;
    }

    /**
     * The Google Cloud Storage URL, starting with `gs://`, pointing to the zip archive which contains the function.
     * 
     */
    @Import(name="sourceArchiveUrl")
      private final @Nullable Output<String> sourceArchiveUrl;

    public Output<String> getSourceArchiveUrl() {
        return this.sourceArchiveUrl == null ? Codegen.empty() : this.sourceArchiveUrl;
    }

    /**
     * **Beta Feature** The source repository where a function is hosted.
     * 
     */
    @Import(name="sourceRepository")
      private final @Nullable Output<SourceRepositoryArgs> sourceRepository;

    public Output<SourceRepositoryArgs> getSourceRepository() {
        return this.sourceRepository == null ? Codegen.empty() : this.sourceRepository;
    }

    /**
     * Input only. An identifier for Firebase function sources. Disclaimer: This field is only supported for Firebase function deployments.
     * 
     */
    @Import(name="sourceToken")
      private final @Nullable Output<String> sourceToken;

    public Output<String> getSourceToken() {
        return this.sourceToken == null ? Codegen.empty() : this.sourceToken;
    }

    /**
     * The Google Cloud Storage signed URL used for source uploading, generated by calling [google.cloud.functions.v1.GenerateUploadUrl]. The signature is validated on write methods (Create, Update) The signature is stripped from the Function object on read methods (Get, List)
     * 
     */
    @Import(name="sourceUploadUrl")
      private final @Nullable Output<String> sourceUploadUrl;

    public Output<String> getSourceUploadUrl() {
        return this.sourceUploadUrl == null ? Codegen.empty() : this.sourceUploadUrl;
    }

    /**
     * The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
     * 
     */
    @Import(name="vpcConnector")
      private final @Nullable Output<String> vpcConnector;

    public Output<String> getVpcConnector() {
        return this.vpcConnector == null ? Codegen.empty() : this.vpcConnector;
    }

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    @Import(name="vpcConnectorEgressSettings")
      private final @Nullable Output<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

    public Output<FunctionVpcConnectorEgressSettings> getVpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings == null ? Codegen.empty() : this.vpcConnectorEgressSettings;
    }

    public FunctionArgs(
        @Nullable Output<Integer> availableMemoryMb,
        @Nullable Output<Map<String,String>> buildEnvironmentVariables,
        @Nullable Output<String> buildWorkerPool,
        @Nullable Output<String> description,
        @Nullable Output<String> dockerRepository,
        @Nullable Output<String> entryPoint,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<EventTriggerArgs> eventTrigger,
        @Nullable Output<HttpsTriggerArgs> httpsTrigger,
        @Nullable Output<FunctionIngressSettings> ingressSettings,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<Integer> maxInstances,
        @Nullable Output<Integer> minInstances,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> runtime,
        @Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables,
        @Nullable Output<List<SecretVolumeArgs>> secretVolumes,
        @Nullable Output<String> serviceAccountEmail,
        @Nullable Output<String> sourceArchiveUrl,
        @Nullable Output<SourceRepositoryArgs> sourceRepository,
        @Nullable Output<String> sourceToken,
        @Nullable Output<String> sourceUploadUrl,
        @Nullable Output<String> timeout,
        @Nullable Output<String> vpcConnector,
        @Nullable Output<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
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
        this.availableMemoryMb = Codegen.empty();
        this.buildEnvironmentVariables = Codegen.empty();
        this.buildWorkerPool = Codegen.empty();
        this.description = Codegen.empty();
        this.dockerRepository = Codegen.empty();
        this.entryPoint = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.eventTrigger = Codegen.empty();
        this.httpsTrigger = Codegen.empty();
        this.ingressSettings = Codegen.empty();
        this.kmsKeyName = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.maxInstances = Codegen.empty();
        this.minInstances = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.project = Codegen.empty();
        this.runtime = Codegen.empty();
        this.secretEnvironmentVariables = Codegen.empty();
        this.secretVolumes = Codegen.empty();
        this.serviceAccountEmail = Codegen.empty();
        this.sourceArchiveUrl = Codegen.empty();
        this.sourceRepository = Codegen.empty();
        this.sourceToken = Codegen.empty();
        this.sourceUploadUrl = Codegen.empty();
        this.timeout = Codegen.empty();
        this.vpcConnector = Codegen.empty();
        this.vpcConnectorEgressSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availableMemoryMb;
        private @Nullable Output<Map<String,String>> buildEnvironmentVariables;
        private @Nullable Output<String> buildWorkerPool;
        private @Nullable Output<String> description;
        private @Nullable Output<String> dockerRepository;
        private @Nullable Output<String> entryPoint;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<EventTriggerArgs> eventTrigger;
        private @Nullable Output<HttpsTriggerArgs> httpsTrigger;
        private @Nullable Output<FunctionIngressSettings> ingressSettings;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> maxInstances;
        private @Nullable Output<Integer> minInstances;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> runtime;
        private @Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables;
        private @Nullable Output<List<SecretVolumeArgs>> secretVolumes;
        private @Nullable Output<String> serviceAccountEmail;
        private @Nullable Output<String> sourceArchiveUrl;
        private @Nullable Output<SourceRepositoryArgs> sourceRepository;
        private @Nullable Output<String> sourceToken;
        private @Nullable Output<String> sourceUploadUrl;
        private @Nullable Output<String> timeout;
        private @Nullable Output<String> vpcConnector;
        private @Nullable Output<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings;

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

        public Builder availableMemoryMb(@Nullable Output<Integer> availableMemoryMb) {
            this.availableMemoryMb = availableMemoryMb;
            return this;
        }
        public Builder availableMemoryMb(@Nullable Integer availableMemoryMb) {
            this.availableMemoryMb = Codegen.ofNullable(availableMemoryMb);
            return this;
        }
        public Builder buildEnvironmentVariables(@Nullable Output<Map<String,String>> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }
        public Builder buildEnvironmentVariables(@Nullable Map<String,String> buildEnvironmentVariables) {
            this.buildEnvironmentVariables = Codegen.ofNullable(buildEnvironmentVariables);
            return this;
        }
        public Builder buildWorkerPool(@Nullable Output<String> buildWorkerPool) {
            this.buildWorkerPool = buildWorkerPool;
            return this;
        }
        public Builder buildWorkerPool(@Nullable String buildWorkerPool) {
            this.buildWorkerPool = Codegen.ofNullable(buildWorkerPool);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dockerRepository(@Nullable Output<String> dockerRepository) {
            this.dockerRepository = dockerRepository;
            return this;
        }
        public Builder dockerRepository(@Nullable String dockerRepository) {
            this.dockerRepository = Codegen.ofNullable(dockerRepository);
            return this;
        }
        public Builder entryPoint(@Nullable Output<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }
        public Builder entryPoint(@Nullable String entryPoint) {
            this.entryPoint = Codegen.ofNullable(entryPoint);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder eventTrigger(@Nullable Output<EventTriggerArgs> eventTrigger) {
            this.eventTrigger = eventTrigger;
            return this;
        }
        public Builder eventTrigger(@Nullable EventTriggerArgs eventTrigger) {
            this.eventTrigger = Codegen.ofNullable(eventTrigger);
            return this;
        }
        public Builder httpsTrigger(@Nullable Output<HttpsTriggerArgs> httpsTrigger) {
            this.httpsTrigger = httpsTrigger;
            return this;
        }
        public Builder httpsTrigger(@Nullable HttpsTriggerArgs httpsTrigger) {
            this.httpsTrigger = Codegen.ofNullable(httpsTrigger);
            return this;
        }
        public Builder ingressSettings(@Nullable Output<FunctionIngressSettings> ingressSettings) {
            this.ingressSettings = ingressSettings;
            return this;
        }
        public Builder ingressSettings(@Nullable FunctionIngressSettings ingressSettings) {
            this.ingressSettings = Codegen.ofNullable(ingressSettings);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Codegen.ofNullable(maxInstances);
            return this;
        }
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Codegen.ofNullable(minInstances);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder runtime(@Nullable Output<String> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = Codegen.ofNullable(runtime);
            return this;
        }
        public Builder secretEnvironmentVariables(@Nullable Output<List<SecretEnvVarArgs>> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }
        public Builder secretEnvironmentVariables(@Nullable List<SecretEnvVarArgs> secretEnvironmentVariables) {
            this.secretEnvironmentVariables = Codegen.ofNullable(secretEnvironmentVariables);
            return this;
        }
        public Builder secretEnvironmentVariables(SecretEnvVarArgs... secretEnvironmentVariables) {
            return secretEnvironmentVariables(List.of(secretEnvironmentVariables));
        }
        public Builder secretVolumes(@Nullable Output<List<SecretVolumeArgs>> secretVolumes) {
            this.secretVolumes = secretVolumes;
            return this;
        }
        public Builder secretVolumes(@Nullable List<SecretVolumeArgs> secretVolumes) {
            this.secretVolumes = Codegen.ofNullable(secretVolumes);
            return this;
        }
        public Builder secretVolumes(SecretVolumeArgs... secretVolumes) {
            return secretVolumes(List.of(secretVolumes));
        }
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Codegen.ofNullable(serviceAccountEmail);
            return this;
        }
        public Builder sourceArchiveUrl(@Nullable Output<String> sourceArchiveUrl) {
            this.sourceArchiveUrl = sourceArchiveUrl;
            return this;
        }
        public Builder sourceArchiveUrl(@Nullable String sourceArchiveUrl) {
            this.sourceArchiveUrl = Codegen.ofNullable(sourceArchiveUrl);
            return this;
        }
        public Builder sourceRepository(@Nullable Output<SourceRepositoryArgs> sourceRepository) {
            this.sourceRepository = sourceRepository;
            return this;
        }
        public Builder sourceRepository(@Nullable SourceRepositoryArgs sourceRepository) {
            this.sourceRepository = Codegen.ofNullable(sourceRepository);
            return this;
        }
        public Builder sourceToken(@Nullable Output<String> sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }
        public Builder sourceToken(@Nullable String sourceToken) {
            this.sourceToken = Codegen.ofNullable(sourceToken);
            return this;
        }
        public Builder sourceUploadUrl(@Nullable Output<String> sourceUploadUrl) {
            this.sourceUploadUrl = sourceUploadUrl;
            return this;
        }
        public Builder sourceUploadUrl(@Nullable String sourceUploadUrl) {
            this.sourceUploadUrl = Codegen.ofNullable(sourceUploadUrl);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder vpcConnector(@Nullable Output<String> vpcConnector) {
            this.vpcConnector = vpcConnector;
            return this;
        }
        public Builder vpcConnector(@Nullable String vpcConnector) {
            this.vpcConnector = Codegen.ofNullable(vpcConnector);
            return this;
        }
        public Builder vpcConnectorEgressSettings(@Nullable Output<FunctionVpcConnectorEgressSettings> vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }
        public Builder vpcConnectorEgressSettings(@Nullable FunctionVpcConnectorEgressSettings vpcConnectorEgressSettings) {
            this.vpcConnectorEgressSettings = Codegen.ofNullable(vpcConnectorEgressSettings);
            return this;
        }        public FunctionArgs build() {
            return new FunctionArgs(availableMemoryMb, buildEnvironmentVariables, buildWorkerPool, description, dockerRepository, entryPoint, environmentVariables, eventTrigger, httpsTrigger, ingressSettings, kmsKeyName, labels, location, maxInstances, minInstances, name, network, project, runtime, secretEnvironmentVariables, secretVolumes, serviceAccountEmail, sourceArchiveUrl, sourceRepository, sourceToken, sourceUploadUrl, timeout, vpcConnector, vpcConnectorEgressSettings);
        }
    }
}
