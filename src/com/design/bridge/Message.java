package com.design.bridge;

abstract class Message
{
	protected MessageSender messageSender;

	abstract public void sendMessage(String message);

}
