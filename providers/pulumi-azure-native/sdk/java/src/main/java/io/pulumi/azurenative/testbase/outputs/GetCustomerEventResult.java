// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.NotificationEventReceiverResponse;
import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCustomerEventResult {
    /**
     * The name of the event subscribed to.
     * 
     */
    private final String eventName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The notification event receivers.
     * 
     */
    private final List<NotificationEventReceiverResponse> receivers;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetCustomerEventResult(
        @OutputCustomType.Parameter("eventName") String eventName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("receivers") List<NotificationEventReceiverResponse> receivers,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.eventName = eventName;
        this.id = id;
        this.name = name;
        this.receivers = receivers;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The name of the event subscribed to.
     * 
    */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The notification event receivers.
     * 
    */
    public List<NotificationEventReceiverResponse> getReceivers() {
        return this.receivers;
    }
    /**
     * The system metadata relating to this resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerEventResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventName;
        private String id;
        private String name;
        private List<NotificationEventReceiverResponse> receivers;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerEventResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventName = defaults.eventName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.receivers = defaults.receivers;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder receivers(List<NotificationEventReceiverResponse> receivers) {
            this.receivers = Objects.requireNonNull(receivers);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCustomerEventResult build() {
            return new GetCustomerEventResult(eventName, id, name, receivers, systemData, type);
        }
    }
}
