// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1beta1.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1beta1.outputs.WorkerConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetWorkerPoolResult {
    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
     */
    private final String createTime;
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    private final String deleteTime;
    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    private final String displayName;
    /**
     * Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
     */
    private final String name;
    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * `WorkerPool` state.
     * 
     */
    private final String state;
    /**
     * A unique identifier for the `WorkerPool`.
     * 
     */
    private final String uid;
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
     */
    private final String updateTime;
    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    private final WorkerConfigResponse workerConfig;

    @OutputCustomType.Constructor
    private GetWorkerPoolResult(
        @OutputCustomType.Parameter("annotations") Map<String,String> annotations,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("deleteTime") String deleteTime,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkConfig") NetworkConfigResponse networkConfig,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("uid") String uid,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("workerConfig") WorkerConfigResponse workerConfig) {
        this.annotations = annotations;
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.etag = etag;
        this.name = name;
        this.networkConfig = networkConfig;
        this.state = state;
        this.uid = uid;
        this.updateTime = updateTime;
        this.workerConfig = workerConfig;
    }

    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
    */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
    */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Network configuration for the `WorkerPool`.
     * 
    */
    public NetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * `WorkerPool` state.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * A unique identifier for the `WorkerPool`.
     * 
    */
    public String getUid() {
        return this.uid;
    }
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Worker configuration for the `WorkerPool`.
     * 
    */
    public WorkerConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private String name;
        private NetworkConfigResponse networkConfig;
        private String state;
        private String uid;
        private String updateTime;
        private WorkerConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkerPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder workerConfig(WorkerConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }
        public GetWorkerPoolResult build() {
            return new GetWorkerPoolResult(annotations, createTime, deleteTime, displayName, etag, name, networkConfig, state, uid, updateTime, workerConfig);
        }
    }
}
