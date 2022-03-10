// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServerCommunicationLinkResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Communication link kind.  This property is used for Azure Portal metadata.
     * 
     */
    private final String kind;
    /**
     * Communication link location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The name of the partner server.
     * 
     */
    private final String partnerServer;
    /**
     * The state.
     * 
     */
    private final String state;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetServerCommunicationLinkResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("partnerServer") String partnerServer,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.partnerServer = partnerServer;
        this.state = state;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Communication link kind.  This property is used for Azure Portal metadata.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Communication link location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the partner server.
     * 
    */
    public String getPartnerServer() {
        return this.partnerServer;
    }
    /**
     * The state.
     * 
    */
    public String getState() {
        return this.state;
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

    public static Builder builder(GetServerCommunicationLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kind;
        private String location;
        private String name;
        private String partnerServer;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCommunicationLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.partnerServer = defaults.partnerServer;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder partnerServer(String partnerServer) {
            this.partnerServer = Objects.requireNonNull(partnerServer);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServerCommunicationLinkResult build() {
            return new GetServerCommunicationLinkResult(id, kind, location, name, partnerServer, state, type);
        }
    }
}
