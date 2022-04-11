// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationGetArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaGetArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerTransportGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerState extends io.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * Output only. The creation time.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<TriggerDestinationGetArgs> destination;

    public Output<TriggerDestinationGetArgs> getDestination() {
        return this.destination == null ? Codegen.empty() : this.destination;
    }

    /**
     * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create
     * requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @Import(name="matchingCriterias")
      private final @Nullable Output<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias;

    public Output<List<TriggerMatchingCriteriaGetArgs>> getMatchingCriterias() {
        return this.matchingCriterias == null ? Codegen.empty() : this.matchingCriterias;
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transports")
      private final @Nullable Output<List<TriggerTransportGetArgs>> transports;

    public Output<List<TriggerTransportGetArgs>> getTransports() {
        return this.transports == null ? Codegen.empty() : this.transports;
    }

    /**
     * Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain
     * unchanged until the resource is deleted.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    /**
     * Output only. The last-modified time.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public TriggerState(
        @Nullable Output<String> createTime,
        @Nullable Output<TriggerDestinationGetArgs> destination,
        @Nullable Output<String> etag,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<TriggerTransportGetArgs>> transports,
        @Nullable Output<String> uid,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.destination = destination;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.matchingCriterias = matchingCriterias;
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.transports = transports;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    private TriggerState() {
        this.createTime = Codegen.empty();
        this.destination = Codegen.empty();
        this.etag = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.matchingCriterias = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.transports = Codegen.empty();
        this.uid = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<TriggerDestinationGetArgs> destination;
        private @Nullable Output<String> etag;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<TriggerTransportGetArgs>> transports;
        private @Nullable Output<String> uid;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.matchingCriterias = defaults.matchingCriterias;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transports = defaults.transports;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder destination(@Nullable Output<TriggerDestinationGetArgs> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable TriggerDestinationGetArgs destination) {
            this.destination = Codegen.ofNullable(destination);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
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
        public Builder matchingCriterias(@Nullable Output<List<TriggerMatchingCriteriaGetArgs>> matchingCriterias) {
            this.matchingCriterias = matchingCriterias;
            return this;
        }
        public Builder matchingCriterias(@Nullable List<TriggerMatchingCriteriaGetArgs> matchingCriterias) {
            this.matchingCriterias = Codegen.ofNullable(matchingCriterias);
            return this;
        }
        public Builder matchingCriterias(TriggerMatchingCriteriaGetArgs... matchingCriterias) {
            return matchingCriterias(List.of(matchingCriterias));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder transports(@Nullable Output<List<TriggerTransportGetArgs>> transports) {
            this.transports = transports;
            return this;
        }
        public Builder transports(@Nullable List<TriggerTransportGetArgs> transports) {
            this.transports = Codegen.ofNullable(transports);
            return this;
        }
        public Builder transports(TriggerTransportGetArgs... transports) {
            return transports(List.of(transports));
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public TriggerState build() {
            return new TriggerState(createTime, destination, etag, labels, location, matchingCriterias, name, project, serviceAccount, transports, uid, updateTime);
        }
    }
}
